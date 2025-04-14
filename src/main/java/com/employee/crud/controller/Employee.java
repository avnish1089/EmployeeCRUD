package com.employee.crud.controller;

import org.springframework.web.bind.annotation.RestController;

import com.employee.crud.dto.EmployeeRequestDTO;
import com.employee.crud.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;





@RestController
public class Employee {

    @Autowired
    EmployeeService employeeService;
    
    @GetMapping("/details/{id}")
    public EmployeeRequestDTO getEmployees(@PathVariable String id ){
        
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/details")
    public EmployeeRequestDTO createNewEmployee(@RequestBody EmployeeRequestDTO employeeRequestDTO ){

       return   employeeService.createNewEmployeeById(employeeRequestDTO);
    }
}
