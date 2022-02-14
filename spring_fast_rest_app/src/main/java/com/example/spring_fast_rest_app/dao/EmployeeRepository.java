package com.example.spring_fast_rest_app.dao;



import com.example.spring_fast_rest_app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public List<Employee> findAllByName(String name);

}
