package com.hanji.springbootmall.service;

import com.hanji.springbootmall.dto.ProductQueryParams;
import com.hanji.springbootmall.dto.ProductRequest;
import com.hanji.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
