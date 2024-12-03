package com.company.EmployeeMangmentSystem.service;

import com.company.EmployeeMangmentSystem.dto.DepartmentDto;
import com.company.EmployeeMangmentSystem.entity.DepartmentEntity;
import com.company.EmployeeMangmentSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    static DepartmentRepository departmentRepository;

    public DepartmentEntity addData(DepartmentDto departmentDto) {
        DepartmentEntity departmentEntity = new DepartmentEntity();
        departmentEntity.setDeptId(0L);
        departmentEntity.setDeptName(departmentEntity.getDeptName());
        departmentEntity.setActive(true);
        departmentEntity.setCreateBy(departmentDto.getCreateBy());
        departmentEntity.setCreateDate(LocalDateTime.now());
        departmentEntity.getUpdateBy(departmentDto.getUpdateBy());
        departmentEntity.setUpdatedDate(LocalDateTime.now());
        return departmentRepository.save(departmentEntity);

    }
    public static List<DepartmentEntity> getAllDepartment(){
        List<DepartmentEntity> list = departmentRepository.findAll();
        return  list;
    }
}
