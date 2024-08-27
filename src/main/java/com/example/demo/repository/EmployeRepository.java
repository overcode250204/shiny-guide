package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findEmployeeById(int id);
}
