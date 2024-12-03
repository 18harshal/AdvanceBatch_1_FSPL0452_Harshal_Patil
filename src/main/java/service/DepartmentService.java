package service;

import com.company.EmployeeMangmentSystem.dto.DepartmentDto;
import com.company.EmployeeMangmentSystem.entity.DepartmentEntity;
import com.company.EmployeeMangmentSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public DepartmentEntity addData(DepartmentDto departmenDto){
        DepartmentEntity departmentEntity = new DepartmentEntity();
        departmentEntity.setDeptId(0L);
        departmentEntity.setDeptName(departmentEntity.getDeptName());
        departmentEntity.setActive(true);
        departmentEntity.setCreateBy(departmenDto.getCreateBy());
        departmentEntity.setCreateDate(LocalDateTime. now());
        departmentEntity.getUpdateBy(departmenDto.getUpdateBy());
        departmentEntity.setUpdatedDate(LocalDateTime.now());
        return  departmentRepository.save(departmentEntity);
    }
}
