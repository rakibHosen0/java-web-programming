package com.example.eshoppers.repository;

import com.example.eshoppers.dto.ProductDTO;

import java.math.BigDecimal;
import java.util.List;

public class DummyProductRepositoryImp implements ProductRepository{
    @Override
    public List<ProductDTO> findAllProduct() {
        return List.of(
                new ProductDTO("Apple iPad","Apple iPad 10.2 32GB", BigDecimal.valueOf(366.99)),
                new ProductDTO("Headphones","Bluetooth headphone", BigDecimal.valueOf(249.99))

        );
    }
}
