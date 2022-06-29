package org.example.microservices.apigateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayServerApplication.class).web(true).run(args);
    }
}
