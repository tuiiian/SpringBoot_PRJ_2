package com.login.springboot_prj_2.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="employees_1")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "firstName",nullable = false)
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "pwd")
    private String pwd;

    @Column(name = "re_pwd")
    private String re_pwd;
}
