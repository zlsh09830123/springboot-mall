package com.hanji.springbootmall.dao;

import com.hanji.springbootmall.dto.ProductRequest;
import com.hanji.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
