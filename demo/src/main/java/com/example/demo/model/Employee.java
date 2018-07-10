package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="employeelist")
public class Employee {

    @Column
    private Long empId;
    @Column
    private String empFirstName;
    @Column
    private String empSecondName;


    public Employee() {

    }

    public Employee(EmployeeForm empForm) {
        this.empId = empForm.getEmpId();
        this.empFirstName = empForm.getEmpFirstName();
        this.empSecondName = empForm.getEmpSecondName();

    }

    public Employee(Long empId, String empFirstName, String empSecondName) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empSecondName = empSecondName;

    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpSecondName() {
        return empSecondName;
    }

    public void setEmpSecondName(String empSecondNameName) {
        this.empSecondName = empSecondNameName;
    }


}