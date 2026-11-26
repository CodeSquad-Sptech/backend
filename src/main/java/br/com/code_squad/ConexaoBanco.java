package br.com.code_squad;
import io.github.cdimascio.dotenv.Dotenv;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConexaoBanco {

    private final JdbcTemplate jdbcTemplate;
    private final BasicDataSource basicDataSource;

    public ConexaoBanco() {
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/evolua"
        + "?useUnicode=true&characterEncoding=UTF-8&connectionCollation=utf8mb4_unicode_ci"
        );
        basicDataSource.setUsername(dotenv.get("DB_USUARIO"));
        basicDataSource.setPassword(dotenv.get("DB_PASS"));

        this.basicDataSource = basicDataSource;
        this.jdbcTemplate = new JdbcTemplate(basicDataSource);
    }

    public BasicDataSource getBasicDataSource() {
        return basicDataSource;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

}
