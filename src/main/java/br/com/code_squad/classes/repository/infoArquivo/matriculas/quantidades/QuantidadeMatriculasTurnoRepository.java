package br.com.code_squad.classes.repository.infoArquivo.matriculas.quantidades;

import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasSexo;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasTurno;
import org.springframework.jdbc.core.JdbcTemplate;

public class QuantidadeMatriculasTurnoRepository {
    private final JdbcTemplate jdbcTemplate;

    public QuantidadeMatriculasTurnoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void inserir(QuantidadeMatriculasTurno quantidadeMatriculasTurno){
        String sql = """
                INSERT INTO quantidade_matriculas_turno
                (diurno, noturno, fkInfoMatriculas) VALUES (
                """ + "? ,".repeat(2) + "?)";
        jdbcTemplate.update(sql, quantidadeMatriculasTurno.getDiurno(), quantidadeMatriculasTurno.getNoturno(),
                quantidadeMatriculasTurno.getFkInfoMatriculas());
    }
}
