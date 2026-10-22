
package br.com.code_squad.classes.repository;

import br.com.code_squad.classes.model.Logs;
import org.springframework.jdbc.core.JdbcTemplate;



public class LogRepository {

    private final JdbcTemplate jdbcTemplate;

    public LogRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;}

    public void inserir(Logs log){
        String sql = "INSERT INTO logs (empresa, funcionario, nivel, mensagem, dataHora) VALUES (?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(sql, "Evolua", "Admin", log.getNivel(), log.getMensagem(), log.getDataHora());
    }

}
