package com.tb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
@NoArgsConstructor
public class Product {
    private int id;
    private String name;
    private int quantity;
}
