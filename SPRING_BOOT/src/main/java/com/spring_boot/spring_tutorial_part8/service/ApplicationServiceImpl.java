package com.spring_boot.spring_tutorial_part8.service;

import com.spring_boot.spring_tutorial_part8.dao.EmployeeRepository;
import com.spring_boot.spring_tutorial_part8.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeDAO(EmployeeRepository employeeDAO) {
        this.employeeRepository = employeeDAO;
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.deleteById(employee.getId());
    }

    @Override
    public Employee getEmployee(Long id) {
        Optional<Employee> emp = employeeRepository.findById(id);
        return emp.get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    @Override
    public List<Employee> findAllByName(String name) {
        return employeeRepository.findAllByName(name);
    }
}
