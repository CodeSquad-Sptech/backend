package br.com.code_squad.classes.repository.infoArquivo.concluintes.quantidades;

import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.QuantidadeConcluintesRaca;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasRaca;
import org.springframework.jdbc.core.JdbcTemplate;

public class QuantidadeConcluintesRacaRepository {
    private final JdbcTemplate jdbcTemplate;

    public QuantidadeConcluintesRacaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void inserir(QuantidadeConcluintesRaca quantidadeConcluintesRaca){
        String sql = """
                INSERT INTO quantidade_concluintes_raca
                (branca, preta, parda, amarela, indigena, corNaoDeclarada, fkInfoConcluintes) VALUES (
                """ + "? ,".repeat(5) + "?)";
        jdbcTemplate.update(sql, quantidadeConcluintesRaca.getBranca(), quantidadeConcluintesRaca.getPreta(),
                quantidadeConcluintesRaca.getParda(), quantidadeConcluintesRaca.getAmarela(),
                quantidadeConcluintesRaca.getIndigena(), quantidadeConcluintesRaca.getCorNaoDeclarada(),
                quantidadeConcluintesRaca.getFkInfoConcluintes());
    }
}
