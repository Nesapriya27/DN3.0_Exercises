package com.example.EmployeeManagementSystem.projection;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeNameEmailProjection {
    String getName();
    String getEmail();

    @Value("#{target.name + ' (' + target.email + ')'}")
    String getNameAndEmail();
}
