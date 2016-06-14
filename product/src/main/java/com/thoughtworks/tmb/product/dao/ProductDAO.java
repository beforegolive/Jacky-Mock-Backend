package com.thoughtworks.tmb.product.dao;

import com.thoughtworks.tmb.common.dao.BaseDaoWrapper;
import com.thoughtworks.tmb.product.model.ProductModel;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import java.util.List;

@Component
public class ProductDAO extends BaseDaoWrapper<ProductModel>{
    public ProductDAO(){
        super(ProductModel.class);
    }

    public List<ProductModel> getAllProduct(){
        Query query = entityManager.createQuery("from ProductModel order by id");
        return query.getResultList();
    }
}
