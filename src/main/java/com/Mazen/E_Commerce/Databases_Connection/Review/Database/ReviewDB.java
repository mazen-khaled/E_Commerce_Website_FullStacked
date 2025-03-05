package com.Mazen.E_Commerce.Databases_Connection.Review.Database;

import com.Mazen.E_Commerce.Databases_Connection.Product.Database.Product_DB;
import com.Mazen.E_Commerce.Databases_Connection.User.Database.User_DB;
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
public class Review_DB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long reviewId;

  @ManyToOne
  @JoinColumn(name = "userId")
  private User_DB userDb;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product_DB productDb;

  private int rating;
  private String comment;
  private LocalDateTime created_at;
}
