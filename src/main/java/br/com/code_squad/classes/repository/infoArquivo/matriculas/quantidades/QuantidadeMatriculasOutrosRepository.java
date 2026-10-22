package br.com.code_squad.classes.repository.infoArquivo.matriculas.quantidades;

import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasIdade;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasOutros;
import org.springframework.jdbc.core.JdbcTemplate;

public class QuantidadeMatriculasOutrosRepository {
    private final JdbcTemplate jdbcTemplate;

    public QuantidadeMatriculasOutrosRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void inserir(QuantidadeMatriculasOutros quantidadeMatriculasOutros){
        String sql = """
                INSERT INTO quantidade_matriculas_outros
                (estrangeiro, financiamento, deficiencia, alunosApoioSocial, quantidadeAlunosSituacaoTrancada, fkInfoMatriculas) VALUES (
                """ + "? ,".repeat(5) + "?)";
        jdbcTemplate.update(sql, quantidadeMatriculasOutros.getEstrangeiro(), quantidadeMatriculasOutros.getFinanciamento(),
                quantidadeMatriculasOutros.getDeficiencia(), quantidadeMatriculasOutros.getAlunosApoioSocial(),
                quantidadeMatriculasOutros.getQuantidadeAlunosSituacaoTrancada(), quantidadeMatriculasOutros.getFkInfoMatriculas());
    }
}
