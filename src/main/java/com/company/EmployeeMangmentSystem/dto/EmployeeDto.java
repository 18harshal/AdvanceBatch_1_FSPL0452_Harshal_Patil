package com.company.EmployeeMangmentSystem.dto;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Getter
public class EmployeeDto {
    private String employeeFirstName;
    private String employeeLastName;
    private  String email;
    private  int age;
    private long contactNo;
    private String joiningDate;
    private double salary;

    private boolean isActive;
    private  String createBy;
    private LocalDateTime createDate;
    private String updateBy;
    private LocalDateTime updatedDate;

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

//    public String getUpdateBy() {
//        return updateBy;
//    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdatedBy() {
        return updateBy;
    }
}
