package com.thoughtworks.tmb.product.service;

import com.thoughtworks.mock.tmb.entity.Product;
import com.thoughtworks.mock.tmb.service.ProductService;
import com.thoughtworks.tmb.product.dao.ProductDAO;
import com.thoughtworks.tmb.product.mapper.ProductMapper;
import com.thoughtworks.tmb.product.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultProductService implements ProductService{

    @Autowired
    ProductDAO productDAO;

    @Autowired
    ProductMapper productMapper;

    public List<Product> getAllProduct() {
        List<ProductModel> list = productDAO.getAllProduct();
        return productMapper.mapList(list, Product.class);
    }
}
