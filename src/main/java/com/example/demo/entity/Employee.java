package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "Employee")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
