package com.afam.crud.example.repository;

import com.afam.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer /*where integer is the data type of primary key ID*/> {


    Product findByName(String name);
}
