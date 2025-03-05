package com.Mazen.E_Commerce.Databases_Connection.User.Database;

import com.Mazen.E_Commerce.Databases_Connection.Cart.Database.Cart_DB;
import com.Mazen.E_Commerce.Databases_Connection.Order.Database.Order_DB;
import com.Mazen.E_Commerce.Databases_Connection.Payment.Database.Payment_DB;
import com.Mazen.E_Commerce.Databases_Connection.Review.Database.Review_DB;
import com.Mazen.E_Commerce.Databases_Connection.User.DataStructure.userRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "users")
public class User_DB {

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Long userId;

  private String email;
  private String password;

  @Enumerated(EnumType.STRING)
  private userRole role;

  private String username;
  private String name;
  private String address;
  private String phoneNumber;

  private String userImageUrl;
  private LocalDateTime accountCreatedAt = LocalDateTime.now();

  // Relations
  @OneToMany(mappedBy = "users")
  private List<Review_DB> reviewDbs;

  @OneToMany(mappedBy = "users")
  private List<Cart_DB> cartDbs;

  @OneToMany(mappedBy = "users")
  private List<Payment_DB> paymentDbs;

  @OneToMany(mappedBy = "users")
  private List<Order_DB> orderDbs;
}
