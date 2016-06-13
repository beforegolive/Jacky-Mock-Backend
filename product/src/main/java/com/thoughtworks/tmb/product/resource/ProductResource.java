package com.thoughtworks.tmb.product.resource;

import com.thoughtworks.mock.tmb.enums.CommonStatus;
import com.thoughtworks.tmb.common.resource.BaseResource;
import com.thoughtworks.mock.tmb.entity.Product;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Path("product")
@Component
public class ProductResource extends BaseResource{
    @GET
    public Response getProductList(){
        List<Product> list = prepareProductList();
        return Response.ok().entity(list).build();
    }

    private List<Product> prepareProductList() {
        Product product = new Product();
        product.setCreateTime(new Date());
        product.setId(1001l);
        product.setCommonstatus(CommonStatus.ENABLES);
        product.setProductName("测试商品3324");

        List<Product> list = new ArrayList<Product>();
        list.add(product);
        return list;
    }
}
