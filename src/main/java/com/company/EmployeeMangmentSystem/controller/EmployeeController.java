package com.company.EmployeeMangmentSystem.controller;

import com.company.EmployeeMangmentSystem.dto.EmployeeDto;
import com.company.EmployeeMangmentSystem.entity.EmployeeEntity;
import com.company.EmployeeMangmentSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/ems")
public class EmployeeController {

@Autowired
    EmployeeService employeeService;
@PostMapping("/addData")
public ResponseEntity<EmployeeEntity> addData(@RequestBody EmployeeDto employeeDto){
    return new ResponseEntity<>(employeeService.addData(employeeDto),CREATED);
}

   @GetMapping("/getData")
   public  ResponseEntity<List<EmployeeEntity>>getAllEmployee(){
   return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.FOUND);
   }

}
