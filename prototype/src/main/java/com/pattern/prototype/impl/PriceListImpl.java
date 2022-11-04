package com.pattern.prototype.impl;


import java.util.ArrayList;
import java.util.List;

public class PriceListImpl implements IPrototype<PriceListImpl>{
    private String listName;

    private List<ProductItem> products = new ArrayList<ProductItem>();

    @Override
    public PriceListImpl deepClone() {
        // TODO Auto-generated method stub
        return null;
    }

    
}
