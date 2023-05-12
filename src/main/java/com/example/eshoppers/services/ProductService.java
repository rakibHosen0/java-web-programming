package com.example.eshoppers.services;

import com.example.eshoppers.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> findAllProductSortedByName();
}
