package com.employee.crud.service;
import com.employee.crud.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.crud.dto.EmployeeRequestDTO;
import com.employee.crud.entity.EmployeeEntity;
import org.modelmapper.ModelMapper;
@Service
public class EmployeeService {

    

    @Autowired
    EmployeeRepository employeeRepository;

    // @Autowired
    // ModelMapper ModelMapper;
    


    public EmployeeRequestDTO getEmployeeById( String id) {
       EmployeeEntity employeeEntity   = employeeRepository.findById(id).orElse(null);
       
       return new EmployeeRequestDTO(employeeEntity.getEmpId() ,employeeEntity.getName() , employeeEntity.getAge()  , employeeEntity.getSalary());
    }


    public EmployeeRequestDTO createNewEmployeeById(EmployeeRequestDTO employeeRequestDTO) {
        
        // EmployeeEntity employeeEntity = modelMapper.map(employeeRequestDTO, EmployeeEntity.class);
        // return modelMapper.map(employeeRepository.save(employeeEntity), EmployeeRequestDTO.class);
        EmployeeEntity employeeEntity = new EmployeeEntity(employeeRequestDTO.getEmpId(), employeeRequestDTO.getName() , 
        employeeRequestDTO.getAge() , employeeRequestDTO.getSalary() );
        System.out.println("dto" + employeeRequestDTO);
        System.out.println(employeeEntity);
         EmployeeEntity saved =  employeeRepository.save(employeeEntity);

        return new EmployeeRequestDTO(saved.getEmpId(), saved.getName(), saved.getAge(), saved.getSalary());
    }
}
