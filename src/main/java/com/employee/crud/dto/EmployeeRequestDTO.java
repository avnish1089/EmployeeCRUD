package com.employee.crud.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeRequestDTO {

    private long empId;
    private String name;
    private int age;
    private int salary;
   
}
