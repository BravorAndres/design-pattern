package com.factorymethod.entity;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Product {
    private Long idProduct;
    private String producrName;
    private double price;
}
