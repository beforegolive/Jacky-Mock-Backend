package com.thoughtworks.tmb.product.model;

import com.thoughtworks.tmb.common.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tmb_product")
public class ProductModel extends BaseModel {
    @Column(name = "product_name", length = 200, nullable = false)
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
