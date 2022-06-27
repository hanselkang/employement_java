package com.employeemanagement.example.employeemanagement.controllers;

import com.employeemanagement.example.employeemanagement.models.Employee;
import com.employeemanagement.example.employeemanagement.repositories.EmployeeRepository;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value="/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping(value="/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) { return employeeRepository.findById(id);}

    @DeleteMapping(value = "/employees/{id}/delete")
    public String deleteEmployee(@PathVariable Long id) {
        employeeRepository.deleteById(id);
        if (employeeRepository.findById(id).isPresent()){
        return "Oh no";}
        else {
            return "Hooray";
        }
    }
}
