
package br.com.code_squad.classes.repository;

import br.com.code_squad.classes.model.Usuario;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class UsuarioRepository {

    private final JdbcTemplate jdbcTemplate;

    public UsuarioRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Integer inserir(Usuario usuario) {

        String sql = """
            INSERT INTO usuario
            (nome, email, senha, administrador, ativo, imagem, fkInstituicao)
            VALUES (?, ?, ?, ?, ?, ?, ?)
            """;

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(conexao -> {
            PreparedStatement comando = conexao.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS
            );

            comando.setString(1, usuario.getNome());
            comando.setString(2, usuario.getEmail());
            comando.setString(3, usuario.getSenha());
            comando.setObject(4, usuario.getAdministrador());
            comando.setObject(5, usuario.getAtivo());
            comando.setString(6, usuario.getImagem());
            comando.setObject(7, usuario.getFkInstituicao());

            return comando;

        }, keyHolder);

        Number idGerado = keyHolder.getKey();

        if (idGerado == null) {
            throw new IllegalStateException(
                    "Não foi possível recuperar o ID do usuário."
            );
        }

        return idGerado.intValue();
    }
}
