package com.Mazen.E_Commerce.Databases_Connection.User.Database;

import com.Mazen.E_Commerce.Databases_Connection.Cart.Database.CartDB;
import com.Mazen.E_Commerce.Databases_Connection.Order.Database.OrderDB;
import com.Mazen.E_Commerce.Databases_Connection.Payment.Database.PaymentDB;
import com.Mazen.E_Commerce.Databases_Connection.Review.Database.ReviewDB;
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
public class UserDB {

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
  @OneToMany(mappedBy = "userDB")
  private List<ReviewDB> reviewDbs;

  @OneToMany(mappedBy = "userDB")
  private List<CartDB> cartDbs;

  @OneToMany(mappedBy = "userDB")
  private List<PaymentDB> paymentDbs;

  @OneToMany(mappedBy = "userDB")
  private List<OrderDB> orderDbs;
}
