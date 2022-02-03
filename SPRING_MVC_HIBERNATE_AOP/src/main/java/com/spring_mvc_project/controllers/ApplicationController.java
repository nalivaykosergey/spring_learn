package com.spring_mvc_project.controllers;

import com.spring_mvc_project.entity.Employee;
import com.spring_mvc_project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/")
public class ApplicationController {

    EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexPage(){
      return "index";
    };

    @RequestMapping(value = "/show_all_employees", method = RequestMethod.GET)
    public String showAllEmployees(Model model){

        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmployees", allEmployees);
        return "show-all-employees";
    };

    @RequestMapping(value = "/add_new_employee")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "add-new-employee";
    }

    @RequestMapping(value = "/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/show_all_employees";
    }

    @RequestMapping(value = "/updateInfo")
    public String updateInfo(@RequestParam("empId") Long id, Model model) {
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);
        return "add-new-employee";
    }

    @RequestMapping(value = "/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/show_all_employees";
    }



}
