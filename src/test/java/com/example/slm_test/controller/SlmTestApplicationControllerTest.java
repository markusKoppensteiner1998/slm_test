package com.example.slm_test.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlmTestApplicationControllerTest {

    @Test
    public void test(){
        SlmTestApplicationController slmTestApplicationController = new SlmTestApplicationController();
        assertEquals(slmTestApplicationController.getMesage(),"ok");
    }

}