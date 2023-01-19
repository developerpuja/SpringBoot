package com.poc.example.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String department;
}
