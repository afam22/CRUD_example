package com.afam.crud.example.controller;

import com.afam.crud.example.entity.Product;
import com.afam.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addAllProducts")
    public List<Product> addAllProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    @GetMapping("/showAllProducts")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id){
        return service.getProductById(id);
    }


    @GetMapping("/productByName/{name}")
    public Product findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }


    @PutMapping("/editProduct")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }

}
