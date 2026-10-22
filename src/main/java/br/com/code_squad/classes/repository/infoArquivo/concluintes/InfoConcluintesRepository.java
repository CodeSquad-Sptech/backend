package br.com.code_squad.classes.repository.infoArquivo.concluintes;

import br.com.code_squad.classes.model.infoArquivo.concluintes.InfoConcluintes;
import br.com.code_squad.classes.model.infoArquivo.matriculas.InfoMatriculas;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class InfoConcluintesRepository {
    private final JdbcTemplate jdbcTemplate;

    public InfoConcluintesRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Integer inserir(InfoConcluintes infoConcluintes) {

        String sql = """
            INSERT INTO info_concluintes
            (fkInfoCurso)
            VALUES (?)
            """;

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(conexao -> {
            PreparedStatement comando = conexao.prepareStatement(
                    sql, Statement.RETURN_GENERATED_KEYS
            );


            comando.setObject(1, infoConcluintes.getFkInfoCurso());

            return comando;
        }, keyHolder);

        Number idGerado = keyHolder.getKey();

        if (idGerado == null) {
            throw new IllegalStateException(
                    "Não foi possível recuperar o ID de InfoMatriculas."
            );
        }

        infoConcluintes.setIdInfoConcluintes(idGerado.intValue());

        return infoConcluintes.getIdInfoConcluintes();
    }
}
