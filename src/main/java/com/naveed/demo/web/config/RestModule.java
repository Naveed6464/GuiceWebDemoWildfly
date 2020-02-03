/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.demo.web.config;

import com.google.inject.AbstractModule;
import com.naveed.web.demo.controller.HomeController;

/**
 *
 * @author nmarahman
 */
public class RestModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(HomeController.class);
    }
    
}
