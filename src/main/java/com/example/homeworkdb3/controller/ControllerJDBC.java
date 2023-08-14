package com.example.homeworkdb3.controller;

import com.example.homeworkdb3.service.ServiceJDBC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ControllerJDBC {
    private final ServiceJDBC serviceJDBC;

    public ControllerJDBC(ServiceJDBC serviceJDBC) {
        this.serviceJDBC = serviceJDBC;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getName(@RequestParam("name") String name) {
        return serviceJDBC.getName(name);
    }
}
