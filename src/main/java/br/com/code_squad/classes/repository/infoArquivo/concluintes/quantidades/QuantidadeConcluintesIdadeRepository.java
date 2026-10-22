package br.com.code_squad.classes.repository.infoArquivo.concluintes.quantidades;

import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.QuantidadeConcluintesIdade;
import org.springframework.jdbc.core.JdbcTemplate;

public class QuantidadeConcluintesIdadeRepository {
    private final JdbcTemplate jdbcTemplate;

    public QuantidadeConcluintesIdadeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void inserir(QuantidadeConcluintesIdade quantidadeConcluintesIdade){
        String sql = """
                INSERT INTO quantidade_concluintes_idade (concluintes0a17, concluintes18a24, 
                concluintes25a29, concluintes30a34, concluintes35a39, concluintes40a49, 
                concluintes50a59, concluintes60Mais, fkInfoConcluintes) VALUES (
                """ + "? ,".repeat(8) + "?)";
        jdbcTemplate.update(sql, quantidadeConcluintesIdade.getConcluintes0a17(), quantidadeConcluintesIdade.getConcluintes18a24(),
                quantidadeConcluintesIdade.getConcluintes25a29(), quantidadeConcluintesIdade.getConcluintes30a34(),
                quantidadeConcluintesIdade.getConcluintes35a39(), quantidadeConcluintesIdade.getConcluintes40a49(),
                quantidadeConcluintesIdade.getConcluintes50a59(), quantidadeConcluintesIdade.getConcluintes60Mais(),
                quantidadeConcluintesIdade.getFkInfoConcluintes());
    }
}
