package com.Mazen.E_Commerce.Databases_Connection.Review.Database;

import com.Mazen.E_Commerce.Databases_Connection.Product.Database.ProductDB;
import com.Mazen.E_Commerce.Databases_Connection.User.Database.UserDB;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "reviews")
public class ReviewDB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long reviewId;

  @ManyToOne
  @JoinColumn(name = "userId")
  private UserDB userDB;

  @ManyToOne
  @JoinColumn(name = "productId")
  private ProductDB productDB;

  private int rating;
  private String comment;
  private LocalDateTime createdAt;
}
