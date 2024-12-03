package service;

import com.company.EmployeeMangmentSystem.dto.EmployeeDto;
import com.company.EmployeeMangmentSystem.entity.EmployeeEntity;
import com.company.EmployeeMangmentSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
   // @Autowired
   // EmployeeEntity employeeEntity;


    public EmployeeEntity addData(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setEmployeeId(0L);
        employeeEntity.setEmployeeFirstName(employeeEntity.getEmployeeFirstName() );
        employeeEntity.setEmployeeLastName( employeeEntity.getEmployeeLastName());
        employeeEntity.setAge(employeeEntity.getAge());
        employeeEntity.setContactNo(employeeEntity.getContactNo());
        employeeEntity.setEmail(employeeEntity.getEmail());
        employeeEntity.setJoiningDate(employeeEntity.getJoiningDate());
        employeeEntity.setSalary(employeeEntity.getSalary());
        employeeEntity.setActive(true);
        employeeEntity.getCreateBy(employeeDto.getCreateBy());
        employeeEntity.setCreateDate(LocalDateTime.now());
        employeeEntity.setUpdateBy(employeeDto.getUpdatedBy());
        employeeEntity.setUpdatedDate(LocalDateTime.now());
        return  employeeRepository.save(employeeEntity);

    }
}
