package com.example.laboratorio3.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

//COMPLETAR
@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;
    private String firstName;
    
}
