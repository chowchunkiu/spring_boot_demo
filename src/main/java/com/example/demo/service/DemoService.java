package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Terry on 24/12/2017.
 */

@Service
public class DemoService implements IDemoService{

    private final static Logger LOGGER = LoggerFactory.getLogger(DemoService.class);

    @Override
    public String testing(){
        LOGGER.info("testing api........");
        return "OK";
    }
}
