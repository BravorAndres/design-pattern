package abstractfactory.rest;

import abstractfactory.service.IProductsService;

public class ProductServiceRestImlp implements IProductsService {

    private static final String[] PRODUCTS = new String[]{"Teclado","Mouse","Monitor"};

    @Override
    public String[] getProducts() {
        System.out.println("RestFull");
        return PRODUCTS;
    }
    
}
