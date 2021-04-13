package ru.netology.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class JdbcService implements CommandLineRunner {


    JdbcRepository jdbcRepository;

    @Autowired
    public JdbcService(JdbcRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
