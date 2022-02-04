package com.spring_mvc_project.service;

import com.spring_mvc_project.entity.Employee;

import java.util.List;

public interface ApplicationService {
    public void saveEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public Employee getEmployee(Long id);
    public List<Employee> getAllEmployees();
}
