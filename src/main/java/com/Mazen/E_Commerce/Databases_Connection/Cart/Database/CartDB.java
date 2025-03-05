package com.Mazen.E_Commerce.Databases_Connection.Cart.Database;

import com.Mazen.E_Commerce.Databases_Connection.Product.Database.Product_DB;
import com.Mazen.E_Commerce.Databases_Connection.User.Database.User_DB;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cart")
public class Cart_DB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long cert_id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User_DB user;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product_DB product;

  private int quantity;
}
