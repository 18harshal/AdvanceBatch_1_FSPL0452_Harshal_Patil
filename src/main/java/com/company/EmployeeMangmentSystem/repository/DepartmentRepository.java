package com.company.EmployeeMangmentSystem.repository;

import com.company.EmployeeMangmentSystem.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
}
