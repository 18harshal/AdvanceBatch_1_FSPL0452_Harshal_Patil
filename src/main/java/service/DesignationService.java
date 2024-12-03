package service;

import com.company.EmployeeMangmentSystem.dto.DesignationDto;
import com.company.EmployeeMangmentSystem.entity.DesignationEntity;
import com.company.EmployeeMangmentSystem.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DesignationService {

    @Autowired
    DesignationRepository designationRepository;

    public DesignationEntity addData(DesignationDto designationDto){

        DesignationEntity designationEntity = new DesignationEntity();

        designationEntity.setDesignationId(0L);
                designationEntity.setDesignationName( designationEntity.getDesignationName());
        designationEntity.setActive(true);
                designationEntity.getCreateBy(designationDto.getCreateBy());
        designationEntity.setCreateDate(LocalDateTime.now());
                designationEntity.setUpdateBy(designationDto.getUpdateBy());
        designationEntity.setUpdatedDate(LocalDateTime.now());
        return designationRepository.save(designationEntity);


    }
}
