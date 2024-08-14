package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Find employees by name
    List<Employee> findByName(String name);

    // Find employees by email containing a specific substring
    List<Employee> findByEmailContaining(String emailPart);

    // Find employees by department name
    List<Employee> findByDepartmentName(String departmentName);

    // Find employees whose name starts with a specific prefix
    List<Employee> findByNameStartingWith(String prefix);
}
