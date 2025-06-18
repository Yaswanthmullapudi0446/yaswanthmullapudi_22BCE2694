package com.school.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
public class Role {
    @Id
    private String id;
    private ERole name;
    
    public enum ERole {
        ROLE_ADMIN,
        ROLE_PRINCIPAL,
        ROLE_TEACHER,
        ROLE_STAFF
    }
    
    // Constructors, getters, and setters...