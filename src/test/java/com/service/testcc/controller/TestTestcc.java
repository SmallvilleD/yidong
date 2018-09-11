package com.service.testcc.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestcc {

        TestccDelegate testccDelegate = new TestccDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testccDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}