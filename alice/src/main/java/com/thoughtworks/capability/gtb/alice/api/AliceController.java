package com.thoughtworks.capability.gtb.alice.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AliceController {
    public String hello() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://bob:8081/hello",String.class);
    }
}
