package com.company.EmployeeMangmentSystem.controller;

import com.company.EmployeeMangmentSystem.dto.DesignationDto;
import com.company.EmployeeMangmentSystem.entity.DesignationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.DesignationService;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
@RequestMapping("/ems")
public class DesignationController {


    @Autowired
    DesignationService designationService;

    @PostMapping("/addData")
    public ResponseEntity<DesignationEntity> addData(DesignationDto designationDto){
        return  new ResponseEntity<>(designationService.addData(designationDto),CREATED);
    }
}
