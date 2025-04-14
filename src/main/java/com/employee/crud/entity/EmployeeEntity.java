package com.employee.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

     @Id
     @GeneratedValue( strategy = GenerationType.AUTO)
    private long empId;
    private String name;
    private int age;
    private int salary;
   

}
