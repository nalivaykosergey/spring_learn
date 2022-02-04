package com.spring_mvc_project.service;

import com.spring_mvc_project.dao.EmployeeDAO;
import com.spring_mvc_project.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    EmployeeDAO employeeDAO;

    @Autowired
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(Employee employee) {
        employeeDAO.deleteEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(Long id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
