package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeRepository employeRepository;
    @Override
    public List<Employee> findAll() {
        return employeRepository.findAll();

    }
}
