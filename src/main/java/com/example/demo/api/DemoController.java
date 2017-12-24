package com.example.demo.api;

import com.example.demo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Terry on 24/12/2017.
 */
@Path("demo")
@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @Value("${testing.message}")
    private String testMessage;

    @GET
    public String testing(){
        return demoService.testing();
    }

    @GET
    @Path("test")
    public String message(){
        return testMessage;
    }
}
