package com.backend.employeemanager.repo;

import com.backend.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
