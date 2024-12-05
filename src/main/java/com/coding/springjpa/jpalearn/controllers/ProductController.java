package com.coding.springjpa.jpalearn.controllers;

import com.coding.springjpa.jpalearn.entities.ProductEntity;
import com.coding.springjpa.jpalearn.repositories.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @GetMapping
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }
}
