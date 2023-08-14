package com.example.homeworkdb3.service;

import com.example.homeworkdb3.repository.RepositoryJDBC;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceJDBC {
    private final RepositoryJDBC repositoryJDBC;

    public ServiceJDBC(RepositoryJDBC repositoryJDBC) {
        this.repositoryJDBC = repositoryJDBC;
    }

    public List<String> getName(String name) {
        return repositoryJDBC.getProductName(name);
    }
}
