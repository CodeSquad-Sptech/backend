package br.com.code_squad.classes.repository.infoArquivo.matriculas;

import br.com.code_squad.classes.model.infoArquivo.InfoCurso;
import br.com.code_squad.classes.model.infoArquivo.matriculas.InfoMatriculas;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class InfoMatriculaRepository {
    private final JdbcTemplate jdbcTemplate;

    public InfoMatriculaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Integer inserir(InfoMatriculas infoMatriculas) {

        String sql = """
            INSERT INTO info_matriculas
            (fkInfoCurso)
            VALUES (?)
            """;

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(conexao -> {
            PreparedStatement comando = conexao.prepareStatement(
                    sql, Statement.RETURN_GENERATED_KEYS
            );


            comando.setObject(1, infoMatriculas.getFkInfoCurso());

            return comando;
        }, keyHolder);

        Number idGerado = keyHolder.getKey();

        if (idGerado == null) {
            throw new IllegalStateException(
                    "Não foi possível recuperar o ID de InfoMatriculas."
            );
        }

        infoMatriculas.setIdInfoMatriculas(idGerado.intValue());

        return infoMatriculas.getIdInfoMatriculas();
    }
}
