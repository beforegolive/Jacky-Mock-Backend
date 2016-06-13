package com.thoughtworks.tmb.product.model;

import com.thoughtworks.tmb.common.model.BaseModel;

public class ProductModel extends BaseModel {
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
