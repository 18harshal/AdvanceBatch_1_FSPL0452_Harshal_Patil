package com.company.EmployeeMangmentSystem.controller;

import com.company.EmployeeMangmentSystem.dto.DepartmentDto;
import com.company.EmployeeMangmentSystem.entity.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.DepartmentService;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
@RequestMapping("/ems")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/addData")
    public ResponseEntity<DepartmentEntity> addData(DepartmentDto departmentDto){
         return  new ResponseEntity<>(departmentService.addData(departmentDto), CREATED);
    }

}
