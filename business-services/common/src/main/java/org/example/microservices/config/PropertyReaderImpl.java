package org.example.microservices.config;

import com.netflix.config.ConfigurationManager;
import com.netflix.config.DynamicIntProperty;
import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;

import java.io.IOException;

public class PropertyReaderImpl implements PropertyReader {

    public static final String UNDEFINED_STRING_PROPERTY = "UNDEFINED";

    public static final int UNDEFINED_INT_PROPERTY = -1;

    public PropertyReaderImpl() {

    }

    public PropertyReaderImpl(String... configFiles) {
        for (String configFile : configFiles) {
            try {
                ConfigurationManager.loadCascadedPropertiesFromResources(configFile);
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        }
    }

    @Override
    public String getStringProperty(String propertyName) {
        if (propertyName == null) {
            return UNDEFINED_STRING_PROPERTY;
        }
        DynamicStringProperty stringProperty =
                DynamicPropertyFactory.getInstance().getStringProperty(propertyName, UNDEFINED_STRING_PROPERTY);
        return stringProperty.get();
    }

    @Override
    public int getIntProperty(String propertyName) {
        if(propertyName == null){
            return UNDEFINED_INT_PROPERTY;
        }
        DynamicIntProperty intProperty =
                DynamicPropertyFactory.getInstance().getIntProperty(propertyName, UNDEFINED_INT_PROPERTY);
        return intProperty.get();
    }
}
