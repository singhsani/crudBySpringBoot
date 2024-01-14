package com.example.first.project.Manager;

import com.example.first.project.Model.Employee;
import com.example.first.project.Service.EmployeeService;

import java.util.List;

public class EmployeeManager {
    private EmployeeService employeeService;
    public EmployeeManager(EmployeeService theEmployee){
        employeeService=theEmployee;
    }
    public EmployeeManager(){

    }

    public List<Employee> getAllEmployeeData() {
        return employeeService.findAll();
    }
}
