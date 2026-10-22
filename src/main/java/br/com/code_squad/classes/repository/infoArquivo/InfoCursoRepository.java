package br.com.code_squad.classes.repository.infoArquivo;

import br.com.code_squad.classes.model.infoArquivo.Importacao;
import br.com.code_squad.classes.model.infoArquivo.InfoCurso;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class InfoCursoRepository {
    private final JdbcTemplate jdbcTemplate;

    public InfoCursoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Integer inserir(InfoCurso infoCurso) {

        String sql = """
            INSERT INTO info_curso
            (ano, nomeCurso, tipoGrauAcademico, tipoModalidadeEnsino, tipoNivelAcademico, fkImportacao)
            VALUES (?, ?, ?, ?, ?, ?)
            """;

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(conexao -> {
            PreparedStatement comando = conexao.prepareStatement(
                    sql, Statement.RETURN_GENERATED_KEYS
            );

            comando.setObject(1, infoCurso.getAno());
            comando.setString(2, infoCurso.getNomeCurso());
            comando.setObject(3, infoCurso.getTipoGrauAcademico());
            comando.setObject(4, infoCurso.getTipoModalidadeEnsino());
            comando.setObject(5, infoCurso.getTipoNivelAcademico());
            comando.setObject(6, infoCurso.getFkImportacao());

            return comando;
        }, keyHolder);

        Number idGerado = keyHolder.getKey();

        if (idGerado == null) {
            throw new IllegalStateException(
                    "Não foi possível recuperar o ID de infoCurso."
            );
        }

        infoCurso.setIdInfoCurso(idGerado.intValue());

        return infoCurso.getIdInfoCurso();
    }
}
