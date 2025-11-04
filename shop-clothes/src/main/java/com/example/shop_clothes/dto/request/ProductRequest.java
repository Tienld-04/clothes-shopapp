package com.example.shop_clothes.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest {
    private String name;
    private Float price;
    private String thumbnail;
    private String description;
    private String material;
    private String brand;

}
