package com.Mazen.E_Commerce.Databases_Connection.Order.Database;

import com.Mazen.E_Commerce.Databases_Connection.OrderItem.Database.OrderItemDB;
import com.Mazen.E_Commerce.Databases_Connection.Payment.Database.PaymentDB;
import com.Mazen.E_Commerce.Databases_Connection.User.Database.UserDB;
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
public class OrderDB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long orderId;

  @ManyToOne
  @JoinColumn(name = "userId")
  private UserDB userDB;

  private LocalDateTime orderDate;
  private BigDecimal totalAmount;
  private String status;

  @OneToMany(mappedBy = "orderDB")
  private List<OrderItemDB> orderItemDB;

  @OneToMany(mappedBy = "orderDB")
  private List<PaymentDB> paymentDB;
}
