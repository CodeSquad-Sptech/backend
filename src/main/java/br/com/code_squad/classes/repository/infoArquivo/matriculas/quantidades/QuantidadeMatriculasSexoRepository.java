package br.com.code_squad.classes.repository.infoArquivo.matriculas.quantidades;

import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasRede;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasSexo;
import org.springframework.jdbc.core.JdbcTemplate;

public class QuantidadeMatriculasSexoRepository {
    private final JdbcTemplate jdbcTemplate;

    public QuantidadeMatriculasSexoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void inserir(QuantidadeMatriculasSexo quantidadeMatriculasSexo){
        String sql = """
                INSERT INTO quantidade_matriculas_sexo
                (feminino, masculino, fkInfoMatriculas) VALUES (
                """ + "? ,".repeat(2) + "?)";
        jdbcTemplate.update(sql, quantidadeMatriculasSexo.getFeminino(), quantidadeMatriculasSexo.getMasculino(),
                quantidadeMatriculasSexo.getFkInfoMatriculas());
    }
}
