package com.spring_mvc_project.dao;


import com.spring_mvc_project.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeDAO {
    public void saveEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public Employee getEmployee(Long id);
    public List<Employee> getAllEmployees();
}
