package com.example.demo.repo;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
    // This interface will automatically provide CRUD operations for the EmployeeController entity
    // You can add custom query methods here if needed
}
