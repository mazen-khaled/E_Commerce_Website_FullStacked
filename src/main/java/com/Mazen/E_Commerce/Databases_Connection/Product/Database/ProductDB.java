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
  private Long product_id;

  private String product_name;
  private String description;
  private BigDecimal price;
  private int stock_quantity;
  private String product_image_url;
  private LocalDateTime created_at;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private CategoryDB categoryDB;

  @OneToMany(mappedBy = "productDB")
  private List<ReviewDB> reviewDB;

  @OneToMany(mappedBy = "productDB")
  private List<CartDB> cartDB;

  @OneToMany(mappedBy = "productDB")
  private List<OrderItemDB> orderItemDB;
}
