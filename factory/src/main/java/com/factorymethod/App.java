package com.factorymethod;

import java.util.List;
import java.sql.SQLException;
import com.factorymethod.dao.ProductDAO;
import com.factorymethod.entity.Product;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        Product productA = new Product(1L,"ProductoA",100);
        Product productB = new Product(2L,"ProductoB",150);

        ProductDAO productDAO = new ProductDAO();

        productDAO.saveProduct(productA);
        productDAO.saveProduct(productB);

        List<Product> products = productDAO.findAllProducts();
        System.out.println("productos:");
        for (Product i:products)
            System.out.println(i);
    }
}
