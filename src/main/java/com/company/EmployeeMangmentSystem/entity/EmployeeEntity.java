package com.company.EmployeeMangmentSystem.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "EmployeeInfo")
public class EmployeeEntity {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long employeeId;
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

        public long getEmployeeId() {
                return employeeId;
        }

        public void setEmployeeId(long employeeId) {
                this.employeeId = employeeId;
        }

        public String getEmployeeFirstName() {
                return employeeFirstName;
        }

        public void setEmployeeFirstName(String employeeFirstName) {
                this.employeeFirstName = employeeFirstName;
        }

        public String getEmployeeLastName() {
                return employeeLastName;
        }

        public void setEmployeeLastName(String employeeLastName) {
                this.employeeLastName = employeeLastName;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public long getContactNo() {
                return contactNo;
        }

        public void setContactNo(long contactNo) {
                this.contactNo = contactNo;
        }

        public double getSalary() {
                return salary;
        }

        public void setSalary(double salary) {
                this.salary = salary;
        }

        public String getJoiningDate() {
                return joiningDate;
        }

        public void setJoiningDate(String joiningDate) {
                this.joiningDate = joiningDate;
        }

        public boolean isActive() {
                return isActive;
        }

        public void setActive(boolean active) {
                isActive = active;
        }

        public String getCreateBy(String createBy) {
                return this.createBy;
        }

        public void setCreateBy(String createBy) {
                this.createBy = createBy;
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

        public LocalDateTime getCreateDate() {
                return createDate;
        }

        public void setCreateDate(LocalDateTime createDate) {
                this.createDate = createDate;
        }
}
