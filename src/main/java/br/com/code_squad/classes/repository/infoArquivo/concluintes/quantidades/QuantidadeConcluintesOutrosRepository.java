package br.com.code_squad.classes.repository.infoArquivo.concluintes.quantidades;

import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.QuantidadeConcluintesOutros;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasOutros;
import org.springframework.jdbc.core.JdbcTemplate;

public class QuantidadeConcluintesOutrosRepository {
    private final JdbcTemplate jdbcTemplate;

    public QuantidadeConcluintesOutrosRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void inserir(QuantidadeConcluintesOutros quantidadeConcluintesOutros){
        String sql = """
                INSERT INTO quantidade_concluintes_outros
                (estrangeiro, financiamento, deficiencia, fkInfoConcluintes) VALUES (
                """ + "? ,".repeat(3) + "?)";
        jdbcTemplate.update(sql, quantidadeConcluintesOutros.getEstrangeiro(), quantidadeConcluintesOutros.getFinanciamento(),
                quantidadeConcluintesOutros.getDeficiencia(), quantidadeConcluintesOutros.getFkInfoConcluintes());
    }
}
