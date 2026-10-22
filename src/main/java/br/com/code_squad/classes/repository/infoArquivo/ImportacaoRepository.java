package br.com.code_squad.classes.repository.infoArquivo;

import br.com.code_squad.classes.model.infoArquivo.Importacao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class ImportacaoRepository {
    private final JdbcTemplate jdbcTemplate;

    public ImportacaoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Integer inserir(Importacao importacao) {

        String sql = """
            INSERT INTO importacao
            (nomeArquivo, dataImportacao, fkUsuario)
            VALUES (?, ?, ?)
            """;

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(conexao -> {
            PreparedStatement comando = conexao.prepareStatement(
                    sql, Statement.RETURN_GENERATED_KEYS
            );

            comando.setString(1, importacao.getNomeArquivo());
            comando.setString(2, importacao.getDataImportacao());
            comando.setObject(3, importacao.getFkUsuario());

            return comando;
        }, keyHolder);

        Number idGerado = keyHolder.getKey();

        if (idGerado == null) {
            throw new IllegalStateException(
                    "Não foi possível recuperar o ID de importacao."
            );
        }

        importacao.setIdImportacao(idGerado.intValue());

        return importacao.getIdImportacao();
    }
}
