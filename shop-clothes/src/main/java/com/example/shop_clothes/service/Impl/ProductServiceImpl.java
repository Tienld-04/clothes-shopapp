package com.example.shop_clothes.service.Impl;

import com.example.shop_clothes.repository.CategoryRepository;
import com.example.shop_clothes.repository.ProductDetailRepository;
import com.example.shop_clothes.repository.ProductImageRepository;
import com.example.shop_clothes.repository.ProductRepository;
import com.example.shop_clothes.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final ProductImageRepository productImageRepository;
    private final ProductDetailRepository productDetailRepository;
}
