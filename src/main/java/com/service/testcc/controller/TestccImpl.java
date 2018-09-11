package com.service.testcc.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-09-11T01:53:42.052Z")

@RestSchema(schemaId = "testcc")
@RequestMapping(path = "/testcc", produces = MediaType.APPLICATION_JSON)
public class TestccImpl {

    @Autowired
    private TestccDelegate userTestccDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestccDelegate.helloworld(name);
    }

}
