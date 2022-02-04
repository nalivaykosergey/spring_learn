package com.spring_mvc_project.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @NotEmpty
    @Pattern(regexp = "^[A-Za-z]{3,25}$", message = "Write your name")
    private String name;

    @Column(name = "surname")
    @NotEmpty
    @Pattern(regexp = "^[A-Za-z]{3,25}$", message = "Write your surname")
    private String surname;

    @Column(name = "department")
    @NotEmpty
    @Pattern(regexp = "^[A-Za-z0-9_-]{3,25}$", message = "Write your department")
    private String department;

    @Column(name = "salary")
    @Min(value = 150, message = "value must be greater then 150")
    @Max(value = 3000,  message = "value must be less then 3000")
    private Integer salary;


    public Employee() {};

    public Employee(String name, String surname, String department, Integer salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
