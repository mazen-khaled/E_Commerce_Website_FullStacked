package com.Mazen.E_Commerce.Databases_Connection.Payment.Database;

import com.Mazen.E_Commerce.Databases_Connection.Order.Database.Order_DB;
import com.Mazen.E_Commerce.Databases_Connection.User.Database.User_DB;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payments")
public class Payment_DB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long payment_id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User_DB user;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private Order_DB order;

  private BigDecimal amount;
  private String status;
  private String payment_method;
  private LocalDateTime payment_date;
}
