package com.Mazen.E_Commerce.Databases_Connection.OrderItem.Database;

import com.Mazen.E_Commerce.Databases_Connection.Order.Database.OrderDB;
import com.Mazen.E_Commerce.Databases_Connection.Product.Database.ProductDB;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orderItems")
public class OrderItemDB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long orderItemId;

  @ManyToOne
  @JoinColumn(name = "orderId")
  private OrderDB orderDB;

  @ManyToOne
  @JoinColumn(name = "productId")
  private ProductDB productDB;

  private int quantity;
  private BigDecimal price;
}
