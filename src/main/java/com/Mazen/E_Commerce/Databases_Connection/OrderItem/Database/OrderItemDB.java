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
@Table(name = "order_items")
public class OrderItemDB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long order_item_id;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private OrderDB orderDB;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private ProductDB productDB;

  private int quantity;
  private BigDecimal price;
}
