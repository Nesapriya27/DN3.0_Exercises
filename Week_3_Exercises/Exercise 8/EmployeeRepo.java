package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.projection.EmployeeNameEmailProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Method to fetch only name and email using projection
    List<EmployeeNameEmailProjection> findAllProjectedBy();
}
