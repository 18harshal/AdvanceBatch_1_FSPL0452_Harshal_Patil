package com.company.EmployeeMangmentSystem.controller;

import com.company.EmployeeMangmentSystem.dto.DesignationDto;
import com.company.EmployeeMangmentSystem.entity.DesignationEntity;
import com.company.EmployeeMangmentSystem.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping(" ")
public class DesignationController {


    @Autowired
    DesignationService designationService;

    @PostMapping("/addData")
    public ResponseEntity<DesignationEntity> addData( @RequestBody DesignationDto designationDto){
        return  new ResponseEntity<>(designationService.addData(designationDto),CREATED);
    }
    @GetMapping(" ")
    public ResponseEntity<List<DesignationEntity>> getAllDesignation(){
        return new ResponseEntity<>(designationService.getAllDesignation(), HttpStatus.FOUND);
    }
}
