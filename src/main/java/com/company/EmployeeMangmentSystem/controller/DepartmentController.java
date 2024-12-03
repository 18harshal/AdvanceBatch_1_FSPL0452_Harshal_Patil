package com.company.EmployeeMangmentSystem.controller;

import com.company.EmployeeMangmentSystem.dto.DepartmentDto;
import com.company.EmployeeMangmentSystem.entity.DepartmentEntity;
import com.company.EmployeeMangmentSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping(" /")
public class DepartmentController {

   @Autowired
   DepartmentService departmentService;

    @PostMapping("/addData")
    public ResponseEntity<DepartmentEntity> addData(@RequestBody DepartmentDto departmentDto){
         return  new ResponseEntity<>(departmentService.addData(departmentDto), CREATED);
    }

    @GetMapping("/ ")
    public ResponseEntity<List<DepartmentEntity>> getAllDepartment(){
         return  new ResponseEntity<>(DepartmentService.getAllDepartment(), HttpStatus.FOUND);
    }
}
