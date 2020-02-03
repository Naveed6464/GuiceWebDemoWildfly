/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.demo.web.servlets;

import com.naveed.demo.web.service.GreetService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServlet;

/**
 *
 * @author Administrator
 */
@Singleton
public class HelloServlet extends HttpServlet {

    @Inject
    GreetService greetService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        response.setContentType("text/html");
        String message = greetService.greet("Hello1 ");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

}
