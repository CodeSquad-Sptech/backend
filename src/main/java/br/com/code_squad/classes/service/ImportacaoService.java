
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
                    "A importação e a lista de cursos são obrigatórias."
            );
        }

        // 1. Registra o arquivo e recupera o ID da importação.
        Integer idImportacao = importacaoRepository.inserir(importacao);

        // 2. Processa cada curso e seus indicadores.
        for (CursoImportadoDTO cursoDTO : cursos) {

            if (cursoDTO == null || cursoDTO.getInfoCurso() == null) {
                throw new IllegalArgumentException(
                        "O DTO e os dados do curso são obrigatórios."
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
        }

        return idImportacao;
    }

    private void salvarMatriculas(
            CursoImportadoDTO cursoDTO,
            Integer idCurso) {

        InfoMatriculas infoMatriculas =
                new InfoMatriculas(null, idCurso);

        Integer idInfoMatriculas =
                infoMatriculaRepository.inserir(infoMatriculas);

        QuantidadeMatriculasIdade idade =
                cursoDTO.getQuantidadeMatriculasIdade();

        if (idade != null) {
            idade.setFkInfoMatriculas(idInfoMatriculas);
            matriculasIdadeRepository.inserir(idade);
        }

        QuantidadeMatriculasRaca raca =
                cursoDTO.getQuantidadeMatriculasRaca();

        if (raca != null) {
            raca.setFkInfoMatriculas(idInfoMatriculas);
            matriculasRacaRepository.inserir(raca);
        }

        QuantidadeMatriculasSexo sexo =
                cursoDTO.getQuantidadeMatriculasSexo();

        if (sexo != null) {
            sexo.setFkInfoMatriculas(idInfoMatriculas);
            matriculasSexoRepository.inserir(sexo);
        }

        QuantidadeMatriculasTurno turno =
                cursoDTO.getQuantidadeMatriculasTurno();

        if (turno != null) {
            turno.setFkInfoMatriculas(idInfoMatriculas);
            matriculasTurnoRepository.inserir(turno);
        }

        QuantidadeMatriculasOutros outros =
                cursoDTO.getQuantidadeMatriculasOutros();

        if (outros != null) {
            outros.setFkInfoMatriculas(idInfoMatriculas);
            matriculasOutrosRepository.inserir(outros);
        }

        QuantidadeMatriculasRede rede =
                cursoDTO.getQuantidadeMatriculasRede();

        if (rede != null) {
            rede.setFkInfoMatriculas(idInfoMatriculas);
            matriculasRedeRepository.inserir(rede);
        }
    }

    private void salvarConcluintes(
            CursoImportadoDTO cursoDTO,
            Integer idCurso) {

        InfoConcluintes infoConcluintes =
                new InfoConcluintes(null, idCurso);

        Integer idInfoConcluintes =
                infoConcluintesRepository.inserir(infoConcluintes);

        QuantidadeConcluintesIdade idade =
                cursoDTO.getQuantidadeConcluintesIdade();

        if (idade != null) {
            idade.setFkInfoConcluintes(idInfoConcluintes);
            concluintesIdadeRepository.inserir(idade);
        }

        QuantidadeConcluintesOutros outros =
                cursoDTO.getQuantidadeConcluintesOutros();

        if (outros != null) {
            outros.setFkInfoConcluintes(idInfoConcluintes);
            concluintesOutrosRepository.inserir(outros);
        }

        QuantidadeConcluintesRaca raca =
                cursoDTO.getQuantidadeConcluintesRaca();

        if (raca != null) {
            raca.setFkInfoConcluintes(idInfoConcluintes);
            concluintesRacaRepository.inserir(raca);
        }

        QuantidadeConcluintesSexo sexo =
                cursoDTO.getQuantidadeConcluintesSexo();

        if (sexo != null) {
            sexo.setFkInfoConcluintes(idInfoConcluintes);
            concluintesSexoRepository.inserir(sexo);
        }

        QuantidadeConcluintesTurno turno =
                cursoDTO.getQuantidadeConcluintesTurno();

        if (turno != null) {
            turno.setFkInfoConcluintes(idInfoConcluintes);
            concluintesTurnoRepository.inserir(turno);
        }

        QuantidadeConcluintesRede rede =
                cursoDTO.getQuantidadeConcluintesRede();

        if (rede != null) {
            rede.setFkInfoConcluintes(idInfoConcluintes);
            concluintesRedeRepository.inserir(rede);
        }
    }
}
