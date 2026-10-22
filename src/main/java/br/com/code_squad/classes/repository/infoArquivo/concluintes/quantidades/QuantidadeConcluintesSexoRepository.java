package br.com.code_squad.classes.repository.infoArquivo.concluintes.quantidades;

import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.QuantidadeConcluintesSexo;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasSexo;
import org.springframework.jdbc.core.JdbcTemplate;

public class QuantidadeConcluintesSexoRepository {
    private final JdbcTemplate jdbcTemplate;

    public QuantidadeConcluintesSexoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void inserir(QuantidadeConcluintesSexo quantidadeConcluintesSexo){
        String sql = """
                INSERT INTO quantidade_concluintes_sexo
                (feminino, masculino, fkInfoConcluintes) VALUES (
                """ + "? ,".repeat(2) + "?)";
        jdbcTemplate.update(sql, quantidadeConcluintesSexo.getFeminino(), quantidadeConcluintesSexo.getMasculino(),
                quantidadeConcluintesSexo.getFkInfoConcluintes());
    }
}
