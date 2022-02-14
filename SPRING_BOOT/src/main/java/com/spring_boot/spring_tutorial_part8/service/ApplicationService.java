package com.spring_boot.spring_tutorial_part8.service;





import com.spring_boot.spring_tutorial_part8.entity.Employee;

import java.util.List;

public interface ApplicationService {
    public void saveEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public Employee getEmployee(Long id);
    public List<Employee> getAllEmployees();
    public List<Employee> findAllByName(String name);
}
