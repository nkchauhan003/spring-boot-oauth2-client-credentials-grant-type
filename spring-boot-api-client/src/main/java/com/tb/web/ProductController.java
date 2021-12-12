package com.tb.web;

import com.tb.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction.clientRegistrationId;

@RestController
public class ProductController {

    @Autowired
    private WebClient webClient;

    @GetMapping(value = "/products-view")
    public List<Product> getProducts() {
        return this.webClient
                .get()
                .uri("http://127.0.0.1:8090/products")
                .attributes(clientRegistrationId("products-client-client-credentials"))
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Product>>() {})
                .block();
    }
}