package com.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 * Created by idodo-i7-01 on 2019/4/23.
 */
public class UserDao {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String queryUserName(Integer id) {
        return jdbcTemplate.queryForObject(
                "select name from test_user where id=?",
                String.class,
                id.toString());
    }
}
