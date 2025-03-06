package com.Mazen.E_Commerce.Databases_Connection.Cart.Database;

import com.Mazen.E_Commerce.Databases_Connection.Product.Database.ProductDB;
import com.Mazen.E_Commerce.Databases_Connection.User.Database.UserDB;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "carts")
public class CartDB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long cart_id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private UserDB userDB;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private ProductDB productDB;

  private int quantity;
}
