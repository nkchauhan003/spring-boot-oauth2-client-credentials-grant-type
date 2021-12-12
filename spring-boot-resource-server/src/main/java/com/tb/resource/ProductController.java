package com.tb.resource;

import com.tb.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        return Arrays.asList(
                new Product[]{new Product(1, "I Pad", 10),
                        new Product(2, "I Phone", 12),
                        new Product(3, "MacBook", 15)});
    }
}
