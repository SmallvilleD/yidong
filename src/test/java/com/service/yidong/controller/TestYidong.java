package com.service.yidong.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestYidong {

        YidongDelegate yidongDelegate = new YidongDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = yidongDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}