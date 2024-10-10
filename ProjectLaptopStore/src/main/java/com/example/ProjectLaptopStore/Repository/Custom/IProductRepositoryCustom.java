package com.example.ProjectLaptopStore.Repository.Custom;

import com.example.ProjectLaptopStore.DTO.Product_CreateProductDTO;
import com.example.ProjectLaptopStore.DTO.Product_FindTopPurchasedProductsDTO;
import com.example.ProjectLaptopStore.DTO.Product_UpdateProductDTO;
import com.example.ProjectLaptopStore.Entity.ProductsEntity;

import java.util.List;

public interface IProductRepositoryCustom {
    List<Product_FindTopPurchasedProductsDTO> findAllProductsWithTotalQuantityOrdered();
    void createProduct(Product_CreateProductDTO createProductDTO);
    ProductsEntity updateProduct(Product_UpdateProductDTO updateProductDTO, ProductsEntity productsEntityById);
}