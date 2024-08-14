package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.dto.EmployeeNameDepartmentDTO;
import com.example.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Custom query to fetch name and department using class-based projection
    @Query("SELECT new com.example.EmployeeManagementSystem.dto.EmployeeNameDepartmentDTO(e.name, d.name) " +
           "FROM Employee e JOIN e.department d")
    List<EmployeeNameDepartmentDTO> findEmployeeNameAndDepartment();
}
