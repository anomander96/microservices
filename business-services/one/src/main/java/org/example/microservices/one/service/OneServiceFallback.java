package org.example.microservices.one.service;

import org.springframework.web.bind.annotation.PathVariable;

public class OneServiceFallback implements OneService {

    @Override
    public String callService(@PathVariable("id") String customerId) {
        throw new RuntimeException("One service is unreachable");
    }

    @Override
    public String callService2(@PathVariable("id") String customerId) {
        throw new RuntimeException("One service is unreachable");
    }

    @Override
    public String testProperty(@PathVariable("propertyName") String propertyName) {
        throw new RuntimeException("One service is unreachable");
    }
}
