package com.hanji.springbootmall.dao;

import com.hanji.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
