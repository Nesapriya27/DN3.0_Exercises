package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Find departments by name
    List<Department> findByName(String name);

    // Find departments by name containing a specific substring
    List<Department> findByNameContaining(String namePart);
}
