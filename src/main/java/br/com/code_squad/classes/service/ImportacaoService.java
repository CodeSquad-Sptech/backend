package br.com.code_squad.classes.service;

import br.com.code_squad.classes.dto.CursoImportadoDTO;

import br.com.code_squad.classes.model.infoArquivo.Importacao;
import br.com.code_squad.classes.model.infoArquivo.InfoCurso;
import br.com.code_squad.classes.model.infoArquivo.matriculas.InfoMatriculas;
import br.com.code_squad.classes.model.infoArquivo.concluintes.InfoConcluintes;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.*;
import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.*;

import br.com.code_squad.classes.repository.infoArquivo.ImportacaoRepository;
import br.com.code_squad.classes.repository.infoArquivo.InfoCursoRepository;
import br.com.code_squad.classes.repository.infoArquivo.matriculas.InfoMatriculaRepository;
import br.com.code_squad.classes.repository.infoArquivo.concluintes.InfoConcluintesRepository;
import br.com.code_squad.classes.repository.infoArquivo.matriculas.quantidades.*;
import br.com.code_squad.classes.repository.infoArquivo.concluintes.quantidades.*;

import java.util.List;

public class ImportacaoService {

    private final ImportacaoRepository importacaoRepository;
    private final InfoCursoRepository infoCursoRepository;
    private final InfoMatriculaRepository infoMatriculaRepository;
    private final InfoConcluintesRepository infoConcluintesRepository;

    private final QuantidadeMatriculasIdadeRepository matriculasIdadeRepository;
    private final QuantidadeMatriculasRacaRepository matriculasRacaRepository;
    private final QuantidadeMatriculasSexoRepository matriculasSexoRepository;
    private final QuantidadeMatriculasTurnoRepository matriculasTurnoRepository;
    private final QuantidadeMatriculasOutrosRepository matriculasOutrosRepository;
    private final QuantidadeMatriculasRedeRepository matriculasRedeRepository;

    private final QuantidadeConcluintesIdadeRepository concluintesIdadeRepository;
    private final QuantidadeConcluintesOutrosRepository concluintesOutrosRepository;
    private final QuantidadeConcluintesRacaRepository concluintesRacaRepository;
    private final QuantidadeConcluintesSexoRepository concluintesSexoRepository;
    private final QuantidadeConcluintesTurnoRepository concluintesTurnoRepository;
    private final QuantidadeConcluintesRedeRepository concluintesRedeRepository;
    private DatetimeService time = new DatetimeService();

    public ImportacaoService(
            ImportacaoRepository importacaoRepository,
            InfoCursoRepository infoCursoRepository,
            InfoMatriculaRepository infoMatriculaRepository,
            InfoConcluintesRepository infoConcluintesRepository,
            QuantidadeMatriculasIdadeRepository matriculasIdadeRepository,
            QuantidadeMatriculasRacaRepository matriculasRacaRepository,
            QuantidadeMatriculasSexoRepository matriculasSexoRepository,
            QuantidadeMatriculasTurnoRepository matriculasTurnoRepository,
            QuantidadeMatriculasOutrosRepository matriculasOutrosRepository,
            QuantidadeMatriculasRedeRepository matriculasRedeRepository,
            QuantidadeConcluintesIdadeRepository concluintesIdadeRepository,
            QuantidadeConcluintesOutrosRepository concluintesOutrosRepository,
            QuantidadeConcluintesRacaRepository concluintesRacaRepository,
            QuantidadeConcluintesSexoRepository concluintesSexoRepository,
            QuantidadeConcluintesTurnoRepository concluintesTurnoRepository,
            QuantidadeConcluintesRedeRepository concluintesRedeRepository) {

        this.importacaoRepository = importacaoRepository;
        this.infoCursoRepository = infoCursoRepository;
        this.infoMatriculaRepository = infoMatriculaRepository;
        this.infoConcluintesRepository = infoConcluintesRepository;

        this.matriculasIdadeRepository = matriculasIdadeRepository;
        this.matriculasRacaRepository = matriculasRacaRepository;
        this.matriculasSexoRepository = matriculasSexoRepository;
        this.matriculasTurnoRepository = matriculasTurnoRepository;
        this.matriculasOutrosRepository = matriculasOutrosRepository;
        this.matriculasRedeRepository = matriculasRedeRepository;

        this.concluintesIdadeRepository = concluintesIdadeRepository;
        this.concluintesOutrosRepository = concluintesOutrosRepository;
        this.concluintesRacaRepository = concluintesRacaRepository;
        this.concluintesSexoRepository = concluintesSexoRepository;
        this.concluintesTurnoRepository = concluintesTurnoRepository;
        this.concluintesRedeRepository = concluintesRedeRepository;
    }

    public Integer importar(
            Importacao importacao,
            List<CursoImportadoDTO> cursos) {

        if (importacao == null || cursos == null) {
            throw new IllegalArgumentException(
                    time.horaAtual() + "ERRO: A importação e a lista de cursos são obrigatórias."
            );
        }

        System.out.println(time.horaAtual() + " | INFO | Processo de importação iniciou com a importação com argumentos validos" + " | Evolua");

        // 1. Registra o arquivo e recupera o ID da importação.
        Integer idImportacao = importacaoRepository.inserir(importacao);

        System.out.println(time.horaAtual() + " | INFO | ID da importação: " + idImportacao + " | Evolua");

        // 2. Processa cada curso e seus indicadores.
        for (CursoImportadoDTO cursoDTO : cursos) {
            System.out.println(time.horaAtual() + " | INFO | Inicio do processo do curso '" + cursoDTO.getInfoCurso().getNomeCurso() + "'." + " | Evolua");

            if (cursoDTO == null || cursoDTO.getInfoCurso() == null) {
                throw new IllegalArgumentException(
                        time.horaAtual() + "ERRO: O DTO e os dados do curso são obrigatórios."
                );
            }

            InfoCurso infoCurso = cursoDTO.getInfoCurso();

            // Vincula o curso à importação atual.
            infoCurso.setFkImportacao(idImportacao);

            // Salva o curso e recupera seu ID.
            Integer idCurso = infoCursoRepository.inserir(infoCurso);

            // Salva matrículas e seus indicadores.
            salvarMatriculas(cursoDTO, idCurso);

            // Salva concluintes e seus indicadores.
            salvarConcluintes(cursoDTO, idCurso);

            System.out.println(time.horaAtual() + " | INFO | Curso '" + cursoDTO.getInfoCurso().getNomeCurso() + "' foi processado." + " | Evolua");
        }

        System.out.println(time.horaAtual() + " | INFO | Fim do processo de importação com id " + idImportacao + " | Evolua");

        return idImportacao;
    }

    private void salvarMatriculas(
            CursoImportadoDTO cursoDTO,
            Integer idCurso) {

        System.out.println(time.horaAtual() + " | INFO | Processo de salvar matriculas iniciado." + " | Evolua");

        InfoMatriculas infoMatriculas =
                new InfoMatriculas(null, idCurso);

        Integer idInfoMatriculas =
                infoMatriculaRepository.inserir(infoMatriculas);

        QuantidadeMatriculasIdade idade =
                cursoDTO.getQuantidadeMatriculasIdade();

        System.out.println(time.horaAtual() + " | INFO | Objeto idade inicializado" + " | Evolua");

        if (idade != null) {
            idade.setFkInfoMatriculas(idInfoMatriculas);
            matriculasIdadeRepository.inserir(idade);
            System.out.println(time.horaAtual() + " | INFO | idade " + idade + " salva" + " | Evolua");
        }

        QuantidadeMatriculasRaca raca =
                cursoDTO.getQuantidadeMatriculasRaca();

        System.out.println(time.horaAtual() + " | INFO | Objeto raca inicializado" + " | Evolua");

        if (raca != null) {
            raca.setFkInfoMatriculas(idInfoMatriculas);
            matriculasRacaRepository.inserir(raca);
            System.out.println(time.horaAtual() + " | INFO | raca " + raca + " salva" + " | Evolua");
        }

        QuantidadeMatriculasSexo sexo =
                cursoDTO.getQuantidadeMatriculasSexo();

        System.out.println(time.horaAtual() + " | INFO | Objeto sexo inicializado" + " | Evolua");

        if (sexo != null) {
            sexo.setFkInfoMatriculas(idInfoMatriculas);
            matriculasSexoRepository.inserir(sexo);
            System.out.println(time.horaAtual() + " | INFO | sexo " + sexo + " salva" + " | Evolua");
        }

        QuantidadeMatriculasTurno turno =
                cursoDTO.getQuantidadeMatriculasTurno();

        System.out.println(time.horaAtual() + " | INFO | Objeto turno inicializado" + " | Evolua");

        if (turno != null) {
            turno.setFkInfoMatriculas(idInfoMatriculas);
            matriculasTurnoRepository.inserir(turno);
            System.out.println(time.horaAtual() + " | INFO | turno " + turno + " salva" + " | Evolua");
        }

        QuantidadeMatriculasOutros outros =
                cursoDTO.getQuantidadeMatriculasOutros();

        System.out.println(time.horaAtual() + " | INFO | Objeto outros inicializado" + " | Evolua");

        if (outros != null) {
            outros.setFkInfoMatriculas(idInfoMatriculas);
            matriculasOutrosRepository.inserir(outros);
            System.out.println(time.horaAtual() + " | INFO | outros " + outros + " salva" + " | Evolua");
        }

        QuantidadeMatriculasRede rede =
                cursoDTO.getQuantidadeMatriculasRede();

        System.out.println(time.horaAtual() + " | INFO | Objeto rede inicializado" + " | Evolua");

        if (rede != null) {
            rede.setFkInfoMatriculas(idInfoMatriculas);
            matriculasRedeRepository.inserir(rede);
            System.out.println(time.horaAtual() + " | INFO | rede " + rede + " salva" + " | Evolua");
        }
    }

    private void salvarConcluintes(
            CursoImportadoDTO cursoDTO,
            Integer idCurso) {
        System.out.println(time.horaAtual() + " | INFO | Processo de salvar concluintes iniciado." + " | Evolua");

        InfoConcluintes infoConcluintes =
                new InfoConcluintes(null, idCurso);

        Integer idInfoConcluintes =
                infoConcluintesRepository.inserir(infoConcluintes);

        QuantidadeConcluintesIdade idade =
                cursoDTO.getQuantidadeConcluintesIdade();

        System.out.println(time.horaAtual() + " | INFO | Objeto idade inicializado" + " | Evolua");

        if (idade != null) {
            idade.setFkInfoConcluintes(idInfoConcluintes);
            concluintesIdadeRepository.inserir(idade);
            System.out.println(time.horaAtual() + " | INFO | idade " + idade + " salva" + " | Evolua");
        }

        QuantidadeConcluintesOutros outros =
                cursoDTO.getQuantidadeConcluintesOutros();

        System.out.println(time.horaAtual() + " | INFO | Objeto outros inicializado" + " | Evolua");

        if (outros != null) {
            outros.setFkInfoConcluintes(idInfoConcluintes);
            concluintesOutrosRepository.inserir(outros);
            System.out.println(time.horaAtual() + " | INFO | raca " + outros + " salva" + " | Evolua");
        }

        QuantidadeConcluintesRaca raca =
                cursoDTO.getQuantidadeConcluintesRaca();

        System.out.println(time.horaAtual() + " | INFO | Objeto raca inicializado" + " | Evolua");

        if (raca != null) {
            raca.setFkInfoConcluintes(idInfoConcluintes);
            concluintesRacaRepository.inserir(raca);
            System.out.println(time.horaAtual() + " | INFO | sexo " + raca + " salva" + " | Evolua");
        }

        QuantidadeConcluintesSexo sexo =
                cursoDTO.getQuantidadeConcluintesSexo();

        System.out.println(time.horaAtual() + " | INFO | Objeto sexo inicializado" + " | Evolua");

        if (sexo != null) {
            sexo.setFkInfoConcluintes(idInfoConcluintes);
            concluintesSexoRepository.inserir(sexo);
            System.out.println(time.horaAtual() + " | INFO | turno " + sexo + " salva" + " | Evolua");
        }

        QuantidadeConcluintesTurno turno =
                cursoDTO.getQuantidadeConcluintesTurno();

        System.out.println(time.horaAtual() + " | INFO | Objeto turno inicializado" + " | Evolua");

        if (turno != null) {
            turno.setFkInfoConcluintes(idInfoConcluintes);
            concluintesTurnoRepository.inserir(turno);
            System.out.println(time.horaAtual() + " | INFO | outros " + turno + " salva" + " | Evolua");
        }

        QuantidadeConcluintesRede rede =
                cursoDTO.getQuantidadeConcluintesRede();

        System.out.println(time.horaAtual() + " | INFO | Objeto rede inicializado" + " | Evolua");

        if (rede != null) {
            rede.setFkInfoConcluintes(idInfoConcluintes);
            concluintesRedeRepository.inserir(rede);
            System.out.println(time.horaAtual() + " | INFO | rede " + rede + " salva" + " | Evolua");
        }
    }
}