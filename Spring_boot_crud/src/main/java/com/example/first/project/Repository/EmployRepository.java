package com.example.first.project.Repository;

import com.example.first.project.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployRepository {
    List<Employee> findAll();
}
