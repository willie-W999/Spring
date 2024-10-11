package com.example.wt1.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wt1.entity.Employee;
import com.example.wt1.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class wt1controller {
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @GetMapping
    public Collection<Employee> findAll(){
        return employeeRepository.findAll();
    }
    @GetMapping("/findid/{id}")
    public Employee findId(@PathVariable("id") long id){
        return employeeRepository.findId(id);
    }
    
    @PutMapping("/update")
    public void save(@RequestBody Employee employee){
        employeeRepository.saveOrupdate(employee);
    }
    
    public void deleteId(@PathVariable("id") long id){
        employeeRepository.deleteId(id);
    }
}
