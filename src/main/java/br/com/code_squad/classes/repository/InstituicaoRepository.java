
package br.com.code_squad.classes.repository;

import br.com.code_squad.classes.model.Instituicao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class InstituicaoRepository {

    private final JdbcTemplate jdbcTemplate;

    public InstituicaoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Integer inserir(Instituicao instituicao) {

        String sql = """
            INSERT INTO instituicao
            (nome, logo, cnpj, uf, cidade, codigo, dataCadastro, imagem)
            VALUES (?, ?, ?, ?, ?, ?, ?, ?)
            """;

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(conexao -> {
            PreparedStatement comando = conexao.prepareStatement(
                    sql, Statement.RETURN_GENERATED_KEYS
            );

            comando.setString(1, instituicao.getNome());
            comando.setString(2, instituicao.getLogo());
            comando.setString(3, instituicao.getCnpj());
            comando.setString(4, instituicao.getUf());
            comando.setString(5, instituicao.getCidade());
            comando.setString(6, instituicao.getCodigo());
            comando.setObject(7, instituicao.getDataCadastro());
            comando.setString(8, instituicao.getImagem());

            return comando;
        }, keyHolder);

        Number idGerado = keyHolder.getKey();

        if (idGerado == null) {
            throw new IllegalStateException(
                    "Não foi possível recuperar o ID da instituição."
            );
        }

        instituicao.setIdInstituicao(idGerado.intValue());

        return instituicao.getIdInstituicao();
    }
}
