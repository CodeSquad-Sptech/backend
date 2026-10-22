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
        jdbcTemplate.update(sql, quantidadeMatriculasIdade.getMatriculas0a17(), quantidadeMatriculasIdade.getMatriculas18a24(),
                quantidadeMatriculasIdade.getMatriculas25a29(), quantidadeMatriculasIdade.getMatriculas30a34(),
                quantidadeMatriculasIdade.getMatriculas35a39(), quantidadeMatriculasIdade.getMatriculas40a49(),
                quantidadeMatriculasIdade.getMatriculas50a59(), quantidadeMatriculasIdade.getMatriculas60Mais(),
                quantidadeMatriculasIdade.getFkInfoMatriculas());
    }
}
