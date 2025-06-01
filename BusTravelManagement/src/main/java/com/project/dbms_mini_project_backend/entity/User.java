package com.project.dbms_mini_project_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String role;
    public void setRole(String role) {
        this.role = role;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    // Getters and Setters
}
