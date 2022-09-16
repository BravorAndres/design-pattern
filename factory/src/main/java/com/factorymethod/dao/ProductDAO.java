package com.factorymethod.dao;


import com.factorymethod.DBFactory;
import com.factorymethod.IDBAdapter;
import com.factorymethod.entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    
    private IDBAdapter dbAdapter;

    public ProductDAO(){
        dbAdapter = DBFactory.getDefaultDBAdapter();

    }

    public List<Product> findAllProducts(){
        Connection connection = dbAdapter.getConnection();
        List<Product>productList = new ArrayList<Product>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT idProductos,prosuctName,ProductPrice FROM Productos");
            ResultSet results = statement.executeQuery();
            while(results.next())
                productList.add(new Product(results.getLong(1),results.getString(2),results.getDouble(3)));
            return productList;
            
        }catch(Exception e){
            return null;
        }finally{
            try{
                connection.close();
            }catch(Exception e){}
        }

    }

    public boolean saveProduct(Product product){
        Connection connection = dbAdapter.getConnection();
        try{
            PreparedStatement statement = connection.prepareStatement("INSERT INTO products(idProducts,prosuctName,productPrice) VALUES(?,?,?");
            statement.setLong(1, product.getIdProduct());
            statement.setString(2, product.getProducrName());
            statement.setDouble(3, product.getPrice());
            statement.executeUpdate();
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                connection.close();
                return false;
            }catch(Exception e){}
        }
        return false;
    }
}
