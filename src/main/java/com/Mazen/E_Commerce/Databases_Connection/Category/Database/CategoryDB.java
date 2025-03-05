package com.Mazen.E_Commerce.Databases_Connection.Category.Database;

import com.Mazen.E_Commerce.Databases_Connection.Product.Database.Product_DB;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class Category_DB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long category_id;

  private String category_name;

  @OneToMany(mappedBy = "category")
  private List<Product_DB> products;
}
