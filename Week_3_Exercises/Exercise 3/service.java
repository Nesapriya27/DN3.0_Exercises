package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.entity.Department;
import com.example.EmployeeManagementSystem.repository.EmployeeRepository;
import com.example.EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Employee> getEmployeesByDepartment(String departmentName) {
        return employeeRepository.findByDepartmentName(departmentName);
    }

    public Employee getEmployeeByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

    public Department getDepartmentByName(String name) {
        return departmentRepository.findByName(name);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
