package com.thoughtworks.tmb.product.mapper;

import com.thoughtworks.mock.tmb.entity.Product;
import com.thoughtworks.tmb.common.util.BaseMapper;
import com.thoughtworks.tmb.product.model.ProductModel;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper extends BaseMapper{
    public ProductMapper(){
        register(Product.class, ProductModel.class);
    }
}
