package com.spring_boot.spring_tutorial_part8.controllers;

import com.spring_boot.spring_tutorial_part8.entity.Employee;
import com.spring_boot.spring_tutorial_part8.exception_handling.NoSuchEmployeeException;
import com.spring_boot.spring_tutorial_part8.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api")
public class MyRestController {

    private ApplicationService applicationService;

    @Autowired
    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping(value = "/employees")
    public List<Employee> showAllEmployees() {
        return applicationService.getAllEmployees();
    }

    @GetMapping(value = "/employees/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        Employee employee = applicationService.getEmployee(id);
        if(employee == null)
            throw new NoSuchEmployeeException("no such employee exception");
        return employee;
    }

    @PostMapping(value = "/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        applicationService.saveEmployee(employee);
        return employee;
    }

    @PutMapping(value = "/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        applicationService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping(value = "/employees/{id}")
    public Employee deleteEmployee(@PathVariable Long id) {
        Employee employee = applicationService.getEmployee(id);
        applicationService.deleteEmployee(employee);
        return employee;
    }

    @GetMapping(value = "/employees/name/{name}")
    public List<Employee> getEmployeesByName(@PathVariable String name){
        return applicationService.findAllByName(name);
    }


}
