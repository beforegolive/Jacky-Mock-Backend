package com.thoughtworks.tmb.product.resource;

import com.thoughtworks.mock.tmb.entity.Product;
import com.thoughtworks.mock.tmb.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.core.Response;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:context.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class ProductResourceTest {

    @Autowired
    ProductResource productResource;

    @Test
    public void getProductList() throws Exception {
        Response response = productResource.getProductList();
        assertNotNull(response);
        List<Product> list = (List<Product>) response.getEntity();
        assertNotNull(list);
        assertTrue(list.size() > 0);
    }

    @Test
    public void getProductEmptyList() throws Exception {
        Response response = productResource.getProductEmptyList();
        assertNotNull(response);
        List<Product> list = (List<Product>) response.getEntity();
        assertNotNull(list);
        assertTrue(list.size() == 0);
    }

    @Test
    public void createProduct() throws Exception {
        Product product = new Product();
        product.setProductName("test name");
        Response response = productResource.createProduct(product);
        assertNotNull(response);
        assertEquals(200, response.getStatus());
    }

}