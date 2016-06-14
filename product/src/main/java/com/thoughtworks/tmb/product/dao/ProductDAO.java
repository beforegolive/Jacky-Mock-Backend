package com.thoughtworks.tmb.product.dao;

import com.thoughtworks.tmb.common.dao.BaseDaoWrapper;
import com.thoughtworks.tmb.product.model.ProductModel;
import org.springframework.stereotype.Component;

@Component
public class ProductDAO extends BaseDaoWrapper<ProductModel>{
    public ProductDAO(){
        super(ProductModel.class);
    }

}
