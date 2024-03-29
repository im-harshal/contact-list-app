package com.cl.app.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Contact {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String email;

    private Contact() {

    }
    
    public Contact(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
