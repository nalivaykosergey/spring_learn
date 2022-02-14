package com.spring_boot.spring_tutorial_part8.exception_handling;

public class EmployeeIncorrectData {

    private String info;

    public EmployeeIncorrectData() {};

    public EmployeeIncorrectData(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
