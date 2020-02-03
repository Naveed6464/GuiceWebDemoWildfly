/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.demo.web.config;

import com.google.inject.servlet.ServletModule;
import com.naveed.demo.web.service.GreetService;
import com.naveed.demo.web.servlets.HelloServlet;

/**
 *
 * @author Naveedur Rahman
 * @since Oct 1, 2019
 * @version 1.0
 *
 */
public class AppModule extends ServletModule {

    @Override
    protected void configureServlets() {
        System.out.println(">>>>>>>>> configure servlets");
        serve("/hello/*").with(HelloServlet.class);
        
        bind(GreetService.class);
    }

}
