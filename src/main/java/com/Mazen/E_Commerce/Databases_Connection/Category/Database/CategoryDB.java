package com.Mazen.E_Commerce.Databases_Connection.Category.Database;

import com.Mazen.E_Commerce.Databases_Connection.Product.Database.ProductDB;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categories")
public class CategoryDB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long category_id;

  private String category_name;

  @OneToMany(mappedBy = "categoryDB")
  private List<ProductDB> productDB;
}
