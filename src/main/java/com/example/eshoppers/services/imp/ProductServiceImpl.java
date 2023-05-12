package com.example.eshoppers.services.imp;

import com.example.eshoppers.dto.ProductDTO;
import com.example.eshoppers.repository.ProductRepository;
import com.example.eshoppers.services.ProductService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDTO> findAllProductSortedByName() {
        return productRepository.findAllProduct()
                .stream()
                .sorted(Comparator.comparing(ProductDTO::getName))
                .collect(Collectors.toList());
    }
}
