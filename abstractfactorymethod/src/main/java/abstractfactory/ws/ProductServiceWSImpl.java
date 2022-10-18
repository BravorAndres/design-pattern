package abstractfactory.ws;

import abstractfactory.service.IProductsService;

public class ProductServiceWSImpl implements IProductsService{

    private static final String[] PRODUCTS = new String[]{"Refresco","Jugo","Fruta"};
    @Override
    public String[] getProducts() {
        System.out.println("WebService");
        return PRODUCTS;
    }
    
}
