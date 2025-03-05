package com.Mazen.E_Commerce.Databases_Connection.Product.Database;

import com.Mazen.E_Commerce.Databases_Connection.Cart.Database.CartDB;
import com.Mazen.E_Commerce.Databases_Connection.Category.Database.CategoryDB;
import com.Mazen.E_Commerce.Databases_Connection.OrderItem.Database.OrderItemDB;
import com.Mazen.E_Commerce.Databases_Connection.Review.Database.ReviewDB;
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
@Table(name = "products")
public class ProductDB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long productId;

  private String productName;
  private String description;
  private BigDecimal price;
  private int stockQuantity;
  private String productImageUrl;
  private LocalDateTime createdAt;

  @ManyToOne
  @JoinColumn(name = "categoryId")
  private CategoryDB categoryDB;

  @OneToMany(mappedBy = "productDB")
  private List<ReviewDB> reviewDB;

  @OneToMany(mappedBy = "productDB")
  private List<CartDB> cartDB;

  @OneToMany(mappedBy = "productDB")
  private List<OrderItemDB> orderItemDB;
}
