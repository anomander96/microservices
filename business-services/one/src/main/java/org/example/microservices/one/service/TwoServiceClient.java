package org.example.microservices.one.service;

import org.example.microservices.twoapi.TwoServiceAPI;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "two")
public interface TwoServiceClient extends TwoServiceAPI {
}
