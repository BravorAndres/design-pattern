package com.factorymethod;

import java.util.Properties;
import com.factorymethod.impl.MySQLDBAdapter;
import com.factorymethod.impl.OracleDBAdapter;
import com.factorymethod.util.PropertiesUtil;


public class DBFactory {
    static final String DB_FACTORY_PROPERTY_URL = "META_INF/DBFactory.properties";
    static final String DEFAULT_DB_CLASS_PROP = "defualtDBClass";

    public static IDBAdapter getDBadapteer(DBType dbType){
        /*
         *  TODO: establecer protocolo cuando se conoce la base
         */
        return null;
    }
}
