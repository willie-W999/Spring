package com.example.wt1.repository.impl;


import java.util.*;

import org.springframework.stereotype.Repository;

import com.example.wt1.entity.Employee;
import com.example.wt1.repository.EmployeeRepository;
@Repository
public class employeereposityimpl implements EmployeeRepository{
    private static Map<Long, Employee> employeemap;
    static{
        employeemap = new HashMap<>();
        employeemap.put(1L, new Employee(1L, "dogbear", 30000));
        employeemap.put(2L, new Employee(2L, "dogshit", 45000));
        employeemap.put(3L, new Employee(3L, "bearshit", 70000));
    }
    @Override
    public Collection<Employee> findAll() {
        // TODO Auto-generated method stub
        return employeemap.values();
    }

    @Override
    public Employee findId(long id) {
        // TODO Auto-generated method stub
        return employeemap.get(id);
    }

    @Override
    public void saveOrupdate(Employee employee) {
        // TODO Auto-generated method stub
        employeemap.put(employee.getId(), employee);
    }

    @Override
    public void deleteId(long id) {
        // TODO Auto-generated method stub
        employeemap.remove(id);
    }
    
}
