package com.restlearn.service;



import com.restlearn.entity.Employee;

import java.util.List;

public interface ApplicationService {
    public void saveEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public Employee getEmployee(Long id);
    public List<Employee> getAllEmployees();
}
