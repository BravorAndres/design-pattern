
package com.pattern.prototype.impl;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductItem implements IPrototype<ProductItem>{
    private String name;
    private Double price;

    public ProductItem(){}

    public ProductItem(String name,double price){
        this();
        this.name = name;
        this.price = price;
    }

    @Override
    public ProductItem clone(){
        return new ProductItem(this.name,this.price);
    }

    @Override
    public ProductItem deepClone(){
        return clone();
    }

    @Override
    public String toString(){
        return "productitem{name = "+name+" price = "+price+"}";
    }

}
