package com.spring.mvc;

import com.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;

public class Employee {

    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;
    @NotBlank(message = "mustn't be empty")
    private String surname;
    @Min(value = 200)
    @Max(value = 1200)
    private int salary;
    private String department;
    private String carBrand;
    private String[] languages;
    @Pattern(
            regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",
            message = "enter your phone number")
    private String phoneNumber;
    @CheckEmail(value = "xyz.com", message = "hello")
    private String email;

    public Employee() {

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
