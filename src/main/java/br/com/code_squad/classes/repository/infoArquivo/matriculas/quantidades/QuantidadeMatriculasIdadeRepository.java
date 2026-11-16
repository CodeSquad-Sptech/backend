package br.com.code_squad.classes.repository.infoArquivo.matriculas.quantidades;

import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasIdade;
import org.springframework.jdbc.core.JdbcTemplate;

public class QuantidadeMatriculasIdadeRepository {
    private final JdbcTemplate jdbcTemplate;

    public QuantidadeMatriculasIdadeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void inserir(QuantidadeMatriculasIdade quantidadeMatriculasIdade){
        String sql = """
                INSERT INTO quantidade_matriculas_idade (matriculas0a17, matriculas18a24, 
                matriculas25a29, matriculas30a34, matriculas35a39, matriculas40a49, 
                matriculas50a59, matriculas60Mais, fkInfoMatriculas) VALUES (
                """ + "? ,".repeat(8) + "?)";
        jdbcTemplate.update(sql, quantidadeMatriculasIdade.getI0a17(), quantidadeMatriculasIdade.getI18a24(),
                quantidadeMatriculasIdade.getI25a29(), quantidadeMatriculasIdade.getI30a34(),
                quantidadeMatriculasIdade.getI35a39(), quantidadeMatriculasIdade.getI40a49(),
                quantidadeMatriculasIdade.getI50a59(), quantidadeMatriculasIdade.getI60Mais(),
                quantidadeMatriculasIdade.getFk());
    }
}
