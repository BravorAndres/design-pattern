package com.singleton.app;

import java.util.Properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.singleton.app.util.PropertiesUtil;

@Getter @Setter @ToString
public class ConfigurationSingle {

    private static ConfigurationSingle singleton;
    
    private static final String CONFIGURATION_PROP = "META-INF/Configuration.properties";

    private static final String APP_NAME_PROP = "appName";
    private static final String APP_VERSION_PROP = "appVersion";

    private String appName;
    private String appVersion;

    private ConfigurationSingle(){
        Properties prop = PropertiesUtil.loadProperty(CONFIGURATION_PROP);

        this.appName = prop.getProperty(APP_NAME_PROP);
        this.appVersion = prop.getProperty(APP_NAME_PROP);
    }

    private static synchronized void createInstance(){
        if(singleton == null){
            singleton = new ConfigurationSingle();
        }
    }

    public static ConfigurationSingle getInstance(){
        if(singleton == null)
            createInstance();
        
        return singleton;
    }
}  
