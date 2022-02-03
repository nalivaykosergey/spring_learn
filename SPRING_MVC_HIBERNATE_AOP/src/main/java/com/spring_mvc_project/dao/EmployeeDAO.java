package com.spring_mvc_project.dao;

import com.spring_mvc_project.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();
    public Employee getEmployee(Long id);
    public void saveEmployee(Employee employee);
    public void deleteEmployee(Long id);

}
