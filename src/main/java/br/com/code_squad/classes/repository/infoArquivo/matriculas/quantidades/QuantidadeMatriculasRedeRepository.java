package br.com.code_squad.classes.repository.infoArquivo.matriculas.quantidades;

import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasRaca;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasRede;
import org.springframework.jdbc.core.JdbcTemplate;

public class QuantidadeMatriculasRedeRepository {
    private final JdbcTemplate jdbcTemplate;

    public QuantidadeMatriculasRedeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void inserir(QuantidadeMatriculasRede quantidadeMatriculasRede){
        String sql = """
                INSERT INTO quantidade_matriculas_rede
                (redePublica, redePrivada, fkInfoMatriculas) VALUES (
                """ + "? ,".repeat(2) + "?)";
        jdbcTemplate.update(sql, quantidadeMatriculasRede.getRedePublica(), quantidadeMatriculasRede.getRedePrivada(),
                quantidadeMatriculasRede.getFkInfoMatriculas());
    }
}
