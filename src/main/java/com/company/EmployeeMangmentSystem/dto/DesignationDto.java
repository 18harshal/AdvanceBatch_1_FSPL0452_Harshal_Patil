package com.company.EmployeeMangmentSystem.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DesignationDto {

    private  String DesignationName;

    private boolean isActive;
    private  String createBy;
    private LocalDateTime createDate;
    private String updateBy;
    private LocalDateTime updatedDate;


    public String getDesignationName() {
        return DesignationName;
    }

    public void setDesignationName(String designationName) {
        DesignationName = designationName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}