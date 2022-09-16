package com.factorymethod;

import java.util.Properties;
import com.factorymethod.impl.MySQLDBAdapter1;
import com.factorymethod.impl.MySQLDBAdapter2;
import com.factorymethod.util.PropertiesUtil;


public class DBFactory {
    static final String DB_FACTORY_PROPERTY_URL = "META_INF/DBFactory.properties";
    static final String DEFAULT_DB_CLASS_PROP = "defualtDBClass";

    public static IDBAdapter getDBadapteer(DBType dbType){
        switch (dbType){
            case MySQL1:
                return new MySQLDBAdapter1();
            case MySQL2:
                return new MySQLDBAdapter2();
            default:
                throw new IllegalArgumentException("No Soportado");
        }
    }

    public static IDBAdapter getDefaultDBAdapter(){
        try{
            Properties prop = PropertiesUtil.loadProperty(DB_FACTORY_PROPERTY_URL);
            String defaultDBClass = prop.getProperty(DEFAULT_DB_CLASS_PROP);
            System.out.println("defaultDBclass ==> "+defaultDBClass);
            return (IDBAdapter) Class.forName(defaultDBClass).newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
