package org.example.microservices.config;

public interface PropertyReader {

    String getStringProperty(String propertyName);

    int getIntProperty(String propertyName);
}
