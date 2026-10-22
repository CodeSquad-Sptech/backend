package br.com.code_squad.classes.repository.infoArquivo.matriculas.quantidades;

import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasOutros;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasRaca;
import org.springframework.jdbc.core.JdbcTemplate;

public class QuantidadeMatriculasRacaRepository {
    private final JdbcTemplate jdbcTemplate;

    public QuantidadeMatriculasRacaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void inserir(QuantidadeMatriculasRaca quantidadeMatriculasRaca){
        String sql = """
                INSERT INTO quantidade_matriculas_raca
                (branca, preta, parda, amarela, indigena, naoDeclarada, fkInfoMatriculas) VALUES (
                """ + "? ,".repeat(6) + "?)";
        jdbcTemplate.update(sql, quantidadeMatriculasRaca.getBranca(), quantidadeMatriculasRaca.getPreta(),
                quantidadeMatriculasRaca.getParda(), quantidadeMatriculasRaca.getAmarela(),
                quantidadeMatriculasRaca.getIndigena(), quantidadeMatriculasRaca.getNaoDeclarada(),
                quantidadeMatriculasRaca.getFkInfoMatriculas());
    }
}
