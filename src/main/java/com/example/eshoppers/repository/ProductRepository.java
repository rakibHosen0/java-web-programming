package com.example.eshoppers.repository;

import com.example.eshoppers.dto.ProductDTO;

import java.util.List;

public interface ProductRepository {
    List<ProductDTO> findAllProduct();
}
