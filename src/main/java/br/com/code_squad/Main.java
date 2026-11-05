package br.com.code_squad;

import br.com.code_squad.classes.dto.CursoImportadoDTO;
import br.com.code_squad.classes.model.infoArquivo.Importacao;
import br.com.code_squad.classes.repository.infoArquivo.ImportacaoRepository;
import br.com.code_squad.classes.repository.infoArquivo.InfoCursoRepository;
import br.com.code_squad.classes.repository.infoArquivo.concluintes.InfoConcluintesRepository;
import br.com.code_squad.classes.repository.infoArquivo.concluintes.quantidades.*;
import br.com.code_squad.classes.repository.infoArquivo.matriculas.InfoMatriculaRepository;
import br.com.code_squad.classes.repository.infoArquivo.matriculas.quantidades.*;
import br.com.code_squad.classes.service.DatetimeService;
import br.com.code_squad.classes.service.ImportacaoService;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatetimeService time = new DatetimeService();

        Path arquivo = args.length > 0
                ? Path.of(args[0])
                : Path.of("planilhas", "teste1.xlsx");
        System.out.println(time.horaAtual() + "INFO:Caminho do arquivo definido");

        System.out.println(time.horaAtual() + "INFO:Iniciar tentativa de leitura");
        try {
            List<CursoImportadoDTO> cursos =
                    new LeituraDados().extrairCursos(arquivo);

            System.out.println(time.horaAtual() + "INFO:Lista iniciada");

            if (cursos.isEmpty()) {
                throw new IllegalArgumentException(
                        time.horaAtual() + "ERRO:A planilha não contém cursos para importar."
                );
            }

            System.out.println(time.horaAtual() + "INFO:Lista não esta vazia");

            ConexaoBanco conexao = new ConexaoBanco();

            System.out.println(time.horaAtual() + "INFO:Conexão com o banco definida");

            System.out.println(time.horaAtual() + "INFO:Iniciar segundo try");
            try {
                int idUsuario = args.length > 1
                        ? Integer.parseInt(args[1])
                        : buscarPrimeiroUsuario(conexao);

                System.out.println(time.horaAtual() + "INFO:Id do usuario definido");

                if (args.length <= 1) {
                    System.out.printf(
                            time.horaAtual() + "INFO:Usando o usuário de menor ID (%d).%n",
                            idUsuario
                    );
                }

                Importacao importacao = new Importacao(
                        null,
                        arquivo.getFileName().toString(),
                        LocalDate.now().toString(),
                        idUsuario
                );

                System.out.println(time.horaAtual() + "INFO:Importação criada");

                Integer idImportacao =
                        criarImportacaoService(conexao)
                                .importar(importacao, cursos);

                System.out.println(time.horaAtual() + "INFO:ID de importação registrado");

                System.out.printf(
                        time.horaAtual() + "INFO:Importação concluída: %d cursos gravados. ID: %d.%n",
                        cursos.size(),
                        idImportacao
                );
            } finally {
                System.out.println(time.horaAtual() + "INFO:Fechando conexão");
                conexao.getBasicDataSource().close();
            }
        } catch (Exception e) {
            System.err.println(
                    time.horaAtual() + "ERRO:Não foi possível importar a planilha: " + e.getMessage()
            );
            Throwable causa = e;
            while (causa.getCause() != null && causa.getCause() != causa) {
                causa = causa.getCause();
            }
            System.err.println(time.horaAtual() + "INFO:Causa raiz: " + causa.getClass().getName()
                    + ": " + causa.getMessage());
            System.exit(1);
        }
    }

    private static int buscarPrimeiroUsuario(ConexaoBanco conexao) {
        DatetimeService time = new DatetimeService();

        Integer idUsuario = conexao.getJdbcTemplate().query(
                "SELECT idUsuario FROM usuario ORDER BY idUsuario LIMIT 1",
                resultado -> resultado.next()
                        ? resultado.getInt("idUsuario")
                        : null
        );

        System.out.println(time.horaAtual() + "INFO:buscarPrimeiroUsuario(): Query feita.");

        if (idUsuario == null) {
            throw new IllegalStateException(
                    time.horaAtual() + "ERRO:Não há usuários cadastrados. Cadastre um usuário antes de importar."
            );
        }

        return idUsuario;
    }

    private static ImportacaoService criarImportacaoService(
            ConexaoBanco conexao
    ) {
        DatetimeService time = new DatetimeService();

        System.out.println(time.horaAtual() + "INFO:criarImportacaoService(): Service iniciado");
        var jdbc = conexao.getJdbcTemplate();

        System.out.println(time.horaAtual() + "INFO:criarImportacaoService(): Variavel com o template criada");

        return new ImportacaoService(
                new ImportacaoRepository(jdbc),
                new InfoCursoRepository(jdbc),
                new InfoMatriculaRepository(jdbc),
                new InfoConcluintesRepository(jdbc),
                new QuantidadeMatriculasIdadeRepository(jdbc),
                new QuantidadeMatriculasRacaRepository(jdbc),
                new QuantidadeMatriculasSexoRepository(jdbc),
                new QuantidadeMatriculasTurnoRepository(jdbc),
                new QuantidadeMatriculasOutrosRepository(jdbc),
                new QuantidadeMatriculasRedeRepository(jdbc),
                new QuantidadeConcluintesIdadeRepository(jdbc),
                new QuantidadeConcluintesOutrosRepository(jdbc),
                new QuantidadeConcluintesRacaRepository(jdbc),
                new QuantidadeConcluintesSexoRepository(jdbc),
                new QuantidadeConcluintesTurnoRepository(jdbc),
                new QuantidadeConcluintesRedeRepository(jdbc)
        );
    }
}