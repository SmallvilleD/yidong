package com.service.yidong.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-09-05T09:26:32.076Z")

@RestSchema(schemaId = "yidong")
@RequestMapping(path = "/yidong", produces = MediaType.APPLICATION_JSON)
public class YidongImpl {

    @Autowired
    private YidongDelegate userYidongDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userYidongDelegate.helloworld(name);
    }

}
