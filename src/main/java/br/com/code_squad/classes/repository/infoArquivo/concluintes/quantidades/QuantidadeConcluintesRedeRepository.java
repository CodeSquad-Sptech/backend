package br.com.code_squad.classes.repository.infoArquivo.concluintes.quantidades;

import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.QuantidadeConcluintesRede;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasRede;
import org.springframework.jdbc.core.JdbcTemplate;

public class QuantidadeConcluintesRedeRepository {
    private final JdbcTemplate jdbcTemplate;

    public QuantidadeConcluintesRedeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void inserir(QuantidadeConcluintesRede quantidadeConcluintesRede){
        String sql = """
                INSERT INTO quantidade_concluintes_rede
                (redePublica, redePrivada, fkInfoConcluintes) VALUES (
                """ + "? ,".repeat(2) + "?)";
        jdbcTemplate.update(sql, quantidadeConcluintesRede.getRedePublica(), quantidadeConcluintesRede.getRedePrivada(),
                quantidadeConcluintesRede.getFkInfoConcluintes());
    }
}
