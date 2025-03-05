package com.Mazen.E_Commerce.Databases_Connection.Payment.Database;

import com.Mazen.E_Commerce.Databases_Connection.Order.Database.OrderDB;
import com.Mazen.E_Commerce.Databases_Connection.User.Database.UserDB;
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
public class PaymentDB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long paymentId;

  @ManyToOne
  @JoinColumn(name = "userId")
  private UserDB userDB;

  @ManyToOne
  @JoinColumn(name = "orderId")
  private OrderDB orderDB;

  private BigDecimal amount;
  private String status;
  private String payment_method;
  private LocalDateTime payment_date;
}
