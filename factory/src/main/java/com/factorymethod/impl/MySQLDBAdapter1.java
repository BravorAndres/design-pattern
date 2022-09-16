package com.factorymethod.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.factorymethod.util.PropertiesUtil;
import com.factorymethod.IDBAdapter;

public class MySQLDBAdapter1 implements IDBAdapter {

    private static final String DB_PROPERTIES = "META-INF/DBMySQL1.properties";

    private static final String DB_NAME_PROP = "dbname";
    private static final String DB_HOST_PROP = "host";
    private static final String DB_PASSWORD_PROP = "password";
    private static final String DB_PORT_DROP = "port";
    private static final String DB_USER_PORP = "user";

    static{
        //bloque para registrar el driver de mySQL
        try{
            new com.mysql.jdbc.Driver();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() {
        try{
            String connectionString = createConnectionString();
            Connection connection = DriverManager.getConnection(connectionString);
            System.out.println("Connection class ==>"+ connection.getClass().getName());
            return connection;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String createConnectionString(){
        Properties prop = PropertiesUtil.loadProperty(DB_PROPERTIES);
        String host = prop.getProperty(DB_HOST_PROP);
        String port = prop.getProperty(DB_PORT_DROP);
        String db = prop.getProperty(DB_NAME_PROP);
        String user = prop.getProperty(DB_USER_PORP);
        String password = prop.getProperty(DB_PASSWORD_PROP);
        
        String connetionString = "jdbc:mysql://"+host+"."+port+"/"+db+"?user="+user+"&password="+password;
        System.out.println("connectionString ==>"+connetionString);
        return connetionString;
    } 

    
}
