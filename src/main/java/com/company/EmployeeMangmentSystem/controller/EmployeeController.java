package com.company.EmployeeMangmentSystem.controller;

import com.company.EmployeeMangmentSystem.dto.EmployeeDto;
import com.company.EmployeeMangmentSystem.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import service.EmployeeService;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
@RequestMapping("/ems")
public class EmployeeController {

@Autowired
    EmployeeService employeeService;
@PostMapping("/addData")
public ResponseEntity<EmployeeEntity> addData(EmployeeDto employeeDto){
    return new ResponseEntity<>(employeeService.addData(employeeDto),CREATED);
}

}
