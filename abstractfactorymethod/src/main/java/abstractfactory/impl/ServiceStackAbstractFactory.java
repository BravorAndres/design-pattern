package abstractfactory.impl;

import java.util.Properties;
import abstractfactory.util.PropertiesUtil;

public class ServiceStackAbstractFactory  {

    public ServiceStackAbstractFactory() {}
    
    public static IServiceStackAbstractFactory createServiceFactory() {
        Properties props = PropertiesUtil.loadProperty(
                "abstractfactory/META-INF/AbstractFactoryConfiguration.properties");
        String factoryClass = 
                props.getProperty("serviceProductImplClass");
        try {
            return (IServiceStackAbstractFactory) 
                    Class.forName(factoryClass).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
