package com.Mazen.E_Commerce.Databases_Tables.User;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "users")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;
    private String name;

    private userRole role;

    @Lob
    @Column (columnDefinition = "bytea")
    private byte[] image;
}
