package config;

import com.study.dao.UserDao;
import com.study.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;

import javax.sql.DataSource;
import java.lang.annotation.Documented;

/**
 * Created by idodo-i7-01 on 2019/4/26.
 */
@Configuration
@Import(JdbcConfig.class)
public class SpringDemoConfig {

    @Bean(name = "jdbcTemplate")
    public JdbcTemplate createJdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "userService")
    public UserService createUserService() {
        UserService userService = new UserService();
//        userService.setUserDao(createUserDao());
        return userService;
    }

    @Bean(name = "userDao")
    public UserDao createUserDao() {
        UserDao userDao = new UserDao();
//        userDao.setJdbcTemplate(createJdbcTemplate(createDataSource()));
        return userDao;
    }
}
