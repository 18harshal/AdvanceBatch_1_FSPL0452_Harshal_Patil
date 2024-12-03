package com.company.EmployeeMangmentSystem.service;

import com.company.EmployeeMangmentSystem.dto.EmployeeDto;
import com.company.EmployeeMangmentSystem.entity.EmployeeEntity;
import com.company.EmployeeMangmentSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeEntity addData(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setEmployeeId(0L);
        employeeEntity.setEmployeeFirstName(employeeDto.getEmployeeFirstName() );
        employeeEntity.setEmployeeLastName( employeeDto.getEmployeeLastName());
        employeeEntity.setAge(employeeDto.getAge());
        employeeEntity.setContactNo(employeeDto.getContactNo());
        employeeEntity.setEmail(employeeDto.getEmail());
        employeeEntity.setJoiningDate(employeeDto.getJoiningDate());
        employeeEntity.setSalary(employeeDto.getSalary());
        employeeEntity.setActive(true);
        employeeEntity.getCreateBy(employeeDto.getCreateBy());
        employeeEntity.setCreateDate(LocalDateTime.now());
        employeeEntity.setUpdateBy(employeeDto.getUpdatedBy());
        employeeEntity.setUpdatedDate(LocalDateTime.now());
        return  employeeRepository.save(employeeEntity);


}

    public List<EmployeeEntity> getAllEmployee() {
        List<EmployeeEntity> list = employeeRepository.findAll();
        return list;
    }
}
