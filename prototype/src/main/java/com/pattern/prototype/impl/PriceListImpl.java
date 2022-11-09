package com.pattern.prototype.impl;


import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
public class PriceListImpl implements IPrototype<PriceListImpl>{
    private String listName;

    private List<ProductItem> products = new ArrayList<ProductItem>();

    public PriceListImpl(String listName){
        this.listName = listName;
    }

    @Override
    public PriceListImpl clone(){
        PriceListImpl clone = new PriceListImpl(listName);
        clone.setProducts(products);
        return clone;
    }

    @Override
    public PriceListImpl deepClone() {
        List<ProductItem>  cloneProducts = new ArrayList<>();
        for(ProductItem item: this.products){
            ProductItem cloneItem = (ProductItem) item.clone();
            cloneProducts.add(cloneItem);
        }
        PriceListImpl clone = new PriceListImpl(listName);
        clone.setProducts(cloneProducts);
        return clone;
    }

    @Override
    public String toString(){
        String items = "";
        for (ProductItem item: this.products){
            items += "\t"+item.toString()+"\n";
        }
        return "PriceListImpl{ListName = "+listName+", Products=\n"+items+"}";
    }

    
}
