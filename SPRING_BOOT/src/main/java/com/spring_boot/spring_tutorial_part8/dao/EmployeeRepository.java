package com.spring_boot.spring_tutorial_part8.dao;


import com.spring_boot.spring_tutorial_part8.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public List<Employee> findAllByName(String name);

}
