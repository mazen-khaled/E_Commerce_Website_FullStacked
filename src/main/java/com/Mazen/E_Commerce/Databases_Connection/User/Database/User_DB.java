package com.Mazen.E_Commerce.Databases_Connection.User.Database;

import com.Mazen.E_Commerce.Databases_Connection.User.DataStructure.userRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "users")
public class User_DB {

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
