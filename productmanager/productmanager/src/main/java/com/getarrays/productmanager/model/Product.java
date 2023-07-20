package com.getarrays.productmanager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private Float price;
    private Integer quantity ;
    @Column(nullable = false, updatable = false)
    private String productCode ;


    public Product() {
    }

    public Product(String name , Float price , Integer quantity, String productCode  ) {
        this.name=name ;
        this.price =price ;
        this.quantity =quantity;
        this.productCode =productCode;
    }

    public Long getId() {
        return id;
    }

    public Float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", productCode='" + productCode + '\'' +
                '}';
    }
}

