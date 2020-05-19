package com.northwind.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String productCode;
    private String productName;
    private String description;
    private Long standardCost;
    private Long listPrice;
    private Integer targetLevel;
    private Integer reorderLevel;
    private Integer minimumReorderQuantity;
    private String quantityPerUnit;
    private Integer discontinued;
    private String category;
}