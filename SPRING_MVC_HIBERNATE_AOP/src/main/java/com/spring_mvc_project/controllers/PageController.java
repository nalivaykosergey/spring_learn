package com.spring_mvc_project.controllers;


import com.spring_mvc_project.entity.Employee;
import com.spring_mvc_project.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;


@Controller
public class PageController {

    ApplicationService applicationService;

    @Autowired
    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @RequestMapping(value = "/")
    public String indexPage() {
        return "index";
    }

    @RequestMapping(value = "/all_employees")
    public String allEmployees(Model model) {
        model.addAttribute(
                "employees", applicationService.getAllEmployees()
        );
        return "all_employees";
    }


    @RequestMapping(value = "/add_new_employee")
    public String addNewEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "modify_employee";
    };

    @RequestMapping(value = "/update_employee")
    public String updateEmployee(@RequestParam("employeeId") Long id, Model model){
        model.addAttribute("employee", applicationService.getEmployee(id));
        return "modify_employee";
    }

    @RequestMapping(value = "/delete_employee")
    public String deleteEmployee(@RequestParam("employeeId") Long id, Model model){
        applicationService.deleteEmployee(
                applicationService.getEmployee(id)
        );
        return "redirect:/all_employees";
    }


    @RequestMapping(value = "/save_employee")
    public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if(bindingResult.hasErrors())
            return "modify_employee";
        applicationService.saveEmployee(employee);
        return "redirect:/all_employees";
    }

}
