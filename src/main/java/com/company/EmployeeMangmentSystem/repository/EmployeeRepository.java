package com.company.EmployeeMangmentSystem.repository;

import com.company.EmployeeMangmentSystem.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
