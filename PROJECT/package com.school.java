package com.school.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principals")
public class Principal {
    @Id
    private String id;
    private String name;
    private String qualification;
    private String email;
    private String phone;
    
    // Constructors, getters, and setters
    public Principal() {}
    
    public Principal(String name, String qualification, String email, String phone) {
        this.name = name;
        this.qualification = qualification;
        this.email = email;
        this.phone = phone;
    }
    
    // Getters and setters...
}