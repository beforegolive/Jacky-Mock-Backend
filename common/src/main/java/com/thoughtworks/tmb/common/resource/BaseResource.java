package com.thoughtworks.tmb.common.resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public abstract class BaseResource {
    private static final Logger LOG = Logger.getLogger(BaseResource.class);
}
