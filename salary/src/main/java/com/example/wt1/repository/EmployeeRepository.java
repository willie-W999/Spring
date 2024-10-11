package com.example.wt1.repository;

import java.util.Collection;

import com.example.wt1.entity.Employee;

public interface EmployeeRepository {
    public Collection<Employee> findAll();
    public Employee findId(long id);
    public void saveOrupdate(Employee employee);
    public void deleteId(long id);
}
