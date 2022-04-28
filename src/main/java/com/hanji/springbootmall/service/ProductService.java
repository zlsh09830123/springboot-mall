package com.hanji.springbootmall.service;

import com.hanji.springbootmall.dto.ProductRequest;
import com.hanji.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
