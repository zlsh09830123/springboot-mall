package com.hanji.springbootmall.dao;

import com.hanji.springbootmall.constant.ProductCategory;
import com.hanji.springbootmall.dto.ProductRequest;
import com.hanji.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
