package com.caleb.e_commerce.controllers;

import com.caleb.e_commerce.dto.ProductDTO;
import com.caleb.e_commerce.entities.Product;
import com.caleb.e_commerce.repositories.ProductRepository;
import com.caleb.e_commerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id){
        return productService.findById(id);
    }

}
