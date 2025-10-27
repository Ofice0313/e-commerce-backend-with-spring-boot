package com.caleb.e_commerce.dto;

import com.caleb.e_commerce.entities.Product;
import jakarta.validation.constraints.*;

public class ProductDTO {

    private Long id;
    @Size(min = 3, max = 80, message = "Name must be 3 to 80 characters long")
    @NotBlank(message = "Field required")
    private String name;
    @Size(min = 10, message = "Description must be minimum 10 characters long")
    @NotBlank(message = "Field required")
    private String description;
    @Positive(message = "Price must be positive")
    private Double price;
    private String imgUrl;

    public ProductDTO() {

    }

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        description = product.getDescription();
        price = product.getPrice();
        imgUrl = product.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
