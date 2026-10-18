package br.com.code_squad.classes.curso;

import org.springframework.jdbc.core.JdbcTemplate;

public class CursoRepository {

    private final JdbcTemplate jdbcTemplate;

    public CursoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void inserir(Curso curso) {
        String sql = "INSERT INTO curso (" +
                "ano, nome_curso, tipo_grau_academico, " +
                "tipo_modalidade_ensino, tipo_nivel_academico, quantidade_matriculas_feminino, " +
                "quantidade_matriculas_masculino, quantidade_matriculas_diurno, quantidade_matriculas_noturno, " +
                "quantidade_matriculas_0_17, quantidade_matriculas_18_24, quantidade_matriculas_25_29, " +
                "quantidade_matriculas_30_34, quantidade_matriculas_35_39, quantidade_matriculas_40_49, " +
                "quantidade_matriculas_50_59, quantidade_matriculas_60_mais, quantidade_matriculas_branca, " +
                "quantidade_matriculas_preta, quantidade_matriculas_parda, quantidade_matriculas_amarela, " +
                "quantidade_matriculas_indigena, quantidade_matriculas_cor_nao_declarada, quantidade_concluintes_feminino, " +
                "quantidade_concluintes_masculino, quantidade_concluintes_diurno, quantidade_concluintes_noturno, " +
                "quantidade_concluintes_0_17, quantidade_concluintes_18_24, quantidade_concluintes_25_29, " +
                "quantidade_concluintes_30_34, quantidade_concluintes_35_39, quantidade_concluintes_40_49, " +
                "quantidade_concluintes_50_59, quantidade_concluintes_60_mais, quantidade_concluintes_branca, " +
                "quantidade_concluintes_preta, quantidade_concluintes_parda, quantidade_concluintes_amarela, " +
                "quantidade_concluintes_indigena, quantidade_concluintes_cor_nao_declarada, quantidade_matriculas_estrangeiro, " +
                "quantidade_concluintes_estrangeiro, quantidade_matriculas_deficiencia, quantidade_concluintes_deficiencia, " +
                "quantidade_matriculas_financiamento, quantidade_concluintes_financiamento, quantidade_alunos_situacao_trancada, " +
                "quantidade_alunos_situacao_desvinculada, quantidade_matriculas_em_rede_publica, quantidade_matriculas_em_rede_privada, " +
                "quantidade_concluintes_em_rede_publica, quantidade_concluintes_em_rede_privada, quantidade_alunos_apoio_social, " +
                "quantidade_matriculas_apoio_social)" +
                " VALUES (" + "?, ".repeat(54) + "?)";

        jdbcTemplate.update(sql, 
                curso.getAno(), curso.getNomeCurso(),
                curso.getTipoGrauAcademico(), curso.getTipoModalidadeEnsino(),
                curso.getTipoNivelAcademico(), curso.getQuantidadeMatriculasFeminino(),
                curso.getQuantidadeMatriculasMasculino(), curso.getQuantidadeMatriculasDiurno(),
                curso.getQuantidadeMatriculasNoturno(), curso.getQuantidadeMatriculas017(),
                curso.getQuantidadeMatriculas1824(), curso.getQuantidadeMatriculas2529(),
                curso.getQuantidadeMatriculas3034(), curso.getQuantidadeMatriculas3539(),
                curso.getQuantidadeMatriculas4049(), curso.getQuantidadeMatriculas5059(),
                curso.getQuantidadeMatriculas60Mais(), curso.getQuantidadeMatriculasBranca(),
                curso.getQuantidadeMatriculasPreta(), curso.getQuantidadeMatriculasParda(),
                curso.getQuantidadeMatriculasAmarela(), curso.getQuantidadeMatriculasIndigena(),
                curso.getQuantidadeMatriculasCorNaoDeclarada(), curso.getQuantidadeConcluintesFeminino(),
                curso.getQuantidadeConcluintesMasculino(), curso.getQuantidadeConcluintesDiurno(),
                curso.getQuantidadeConcluintesNoturno(), curso.getQuantidadeConcluintes017(),
                curso.getQuantidadeConcluintes1824(), curso.getQuantidadeConcluintes2529(),
                curso.getQuantidadeConcluintes3034(), curso.getQuantidadeConcluintes3539(),
                curso.getQuantidadeConcluintes4049(), curso.getQuantidadeConcluintes5059(),
                curso.getQuantidadeConcluintes60Mais(), curso.getQuantidadeConcluintesBranca(),
                curso.getQuantidadeConcluintesPreta(), curso.getQuantidadeConcluintesParda(),
                curso.getQuantidadeConcluintesAmarela(), curso.getQuantidadeConcluintesIndigena(),
                curso.getQuantidadeConcluintesCorNaoDeclarada(), curso.getQuantidadeMatriculasEstrangeiro(),
                curso.getQuantidadeConcluintesEstrangeiro(), curso.getQuantidadeMatriculasDeficiencia(),
                curso.getQuantidadeConcluintesDeficiencia(), curso.getQuantidadeMatriculasFinanciamento(),
                curso.getQuantidadeConcluintesFinanciamento(), curso.getQuantidadeAlunosSituacaoTrancada(),
                curso.getQuantidadeAlunosSituacaoDesvinculada(), curso.getQuantidadeMatriculasEmRedePublica(),
                curso.getQuantidadeMatriculasEmRedePrivada(), curso.getQuantidadeConcluintesEmRedePublica(),
                curso.getQuantidadeConcluintesEmRedePrivada(), curso.getQuantidadeAlunosApoioSocial(),
                curso.getQuantidadeMatriculasApoioSocial()
        );
    }
}
