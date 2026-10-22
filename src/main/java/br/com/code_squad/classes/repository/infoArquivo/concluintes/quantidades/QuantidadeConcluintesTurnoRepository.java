package br.com.code_squad.classes.repository.infoArquivo.concluintes.quantidades;

import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.QuantidadeConcluintesTurno;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasTurno;
import org.springframework.jdbc.core.JdbcTemplate;

public class QuantidadeConcluintesTurnoRepository {
    private final JdbcTemplate jdbcTemplate;

    public QuantidadeConcluintesTurnoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void inserir(QuantidadeConcluintesTurno quantidadeConcluintesTurno){
        String sql = """
                INSERT INTO quantidade_concluintes_turno
                (diurno, noturno, fkInfoConcluintes) VALUES (
                """ + "? ,".repeat(2) + "?)";
        jdbcTemplate.update(sql, quantidadeConcluintesTurno.getDiurno(), quantidadeConcluintesTurno.getNoturno(),
                quantidadeConcluintesTurno.getFkInfoConcluintes());
    }
}
