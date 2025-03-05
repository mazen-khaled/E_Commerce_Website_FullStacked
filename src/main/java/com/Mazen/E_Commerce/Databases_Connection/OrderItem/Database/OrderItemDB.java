package com.Mazen.E_Commerce.Databases_Connection.OrderItem.Database;

import com.Mazen.E_Commerce.Databases_Connection.Order.Database.Order_DB;
import com.Mazen.E_Commerce.Databases_Connection.Product.Database.Product_DB;
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
public class OrderItem_DB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long order_item_id;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private Order_DB order;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product_DB product;

  private int quantity;
  private BigDecimal price;
}
