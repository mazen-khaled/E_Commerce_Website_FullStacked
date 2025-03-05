package com.Mazen.E_Commerce.Databases_Connection.Order.Database;

import com.Mazen.E_Commerce.Databases_Connection.OrderItem.Database.OrderItem_DB;
import com.Mazen.E_Commerce.Databases_Connection.Payment.Database.Payment_DB;
import com.Mazen.E_Commerce.Databases_Connection.User.Database.User_DB;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order_DB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long order_id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User_DB user;

  private LocalDateTime order_date;
  private BigDecimal total_amount;
  private String status;

  @OneToMany(mappedBy = "order")
  private List<OrderItem_DB> orderItems;

  @OneToMany(mappedBy = "order")
  private List<Payment_DB> payments;
}
