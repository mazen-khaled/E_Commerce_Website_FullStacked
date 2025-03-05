package com.Mazen.E_Commerce.Databases_Connection.Product.Database;

import com.Mazen.E_Commerce.Databases_Connection.Cart.Database.Cart_DB;
import com.Mazen.E_Commerce.Databases_Connection.Category.Database.Category_DB;
import com.Mazen.E_Commerce.Databases_Connection.OrderItem.Database.OrderItem_DB;
import com.Mazen.E_Commerce.Databases_Connection.Review.Database.Review_DB;
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
public class Product_DB {
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
  private Category_DB category;

  @OneToMany(mappedBy = "product")
  private List<Review_DB> reviews;

  @OneToMany(mappedBy = "product")
  private List<Cart_DB> certs;

  @OneToMany(mappedBy = "product")
  private List<OrderItem_DB> orderItems;
}
