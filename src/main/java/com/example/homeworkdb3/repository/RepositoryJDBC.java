package com.example.homeworkdb3.repository;

import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class RepositoryJDBC {

    private final NamedParameterJdbcTemplate template;
    private final String sql;

    public RepositoryJDBC(NamedParameterJdbcTemplate template) {
        this.template = template;
        sql = read("product_by_name.sql");
    }

    public List<String> getProductName(String name) {
        var result = template.queryForList(sql, Map.of("name", name), String.class);
        System.out.println(result);
        return result;
    }

    private static String read(String sql) {
        try (InputStream is = new ClassPathResource(sql).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
