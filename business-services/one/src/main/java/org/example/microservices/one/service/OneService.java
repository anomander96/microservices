package org.example.microservices.one.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface OneService {

    @RequestMapping(value = "/callService/{id}", method = RequestMethod.GET, produces = "application/json")
    String callService(@PathVariable("id") String customerId);

    @RequestMapping(value = "/callService2/{id}", method = RequestMethod.GET, produces = "application/json")
    String callService2(@PathVariable("id") String customerId);

    @RequestMapping(value = "/property/{propertyName}", method = RequestMethod.GET, produces = "application/json")
    String testProperty(@PathVariable("propertyName") String propertyName);
}
