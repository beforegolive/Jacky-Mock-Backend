package com.thoughtworks.tmb.product.resource;

import com.thoughtworks.mock.tmb.entity.Product;
import com.thoughtworks.mock.tmb.service.ProductService;
import com.thoughtworks.tmb.common.resource.BaseResource;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("product")
@Component
public class ProductResource extends BaseResource{

    @Autowired
    ProductService productService;

    @GET
    public Response getProductList(){
        List<Product> list = productService.getAllProduct();
        return Response.ok().entity(list).build();
    }

    @GET
    @Path("/empty")
    public Response getProductEmptyList(){
        return Response.ok().entity(new ArrayList(0)).build();
    }

    @POST
    public Response createProduct(Product product){
        Exception exception = checkRequestParam(product);
        if(exception != null) {
            return Response.status(Response.Status.BAD_REQUEST).entity(exception).build();
        }
        return Response.ok().build();
    }

    private Exception checkRequestParam(Product product) {
        if(StringUtils.isEmpty(product.getProductName())) return new Exception("Product Name can't be empty.");
        return null;
    }

}
