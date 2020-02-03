package com.naveed.demo.web.config;

import com.google.inject.Guice;
import com.google.inject.servlet.GuiceFilter;
import java.util.Set;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;

/**
 *
 * @author Naveedur Rahman
 * @since Oct 4, 2016
 * @version 1.0
 *
 */
//@HandlesTypes(WebApplicationInitializer.class)
public class WebConfig implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println(">>>>>>>>>>>>> Container Intializer!");
//        servletContext.addFilter("guiceFilter", GuiceFilter.class).addMappingForUrlPatterns(null, true, "/srv/*");
//        Guice.createInjector(new AppModule());
        
        
        servletContext.addListener(GuiceResteasyBootstrapServletContextListener.class);
        ServletRegistration.Dynamic servlet = servletContext.addServlet(
                "resteasy", HttpServletDispatcher.class);
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/*");
//        Guice.createInjector(new AppModule());
//        servletContext.setInitParameter("resteasy.servlet.mapping.prefix", "/api/*");
        servletContext.setInitParameter("resteasy.guice.modules", "com.naveed.demo.web.config.RestModule");
    }

}
