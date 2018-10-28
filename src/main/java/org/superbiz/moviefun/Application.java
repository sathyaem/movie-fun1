package org.superbiz.moviefun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] ar)
    {
        SpringApplication.run(Application.class,ar);
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean(ActionServlet servlet)
    {
        return new ServletRegistrationBean(servlet,"/moviefun/*");
    }
}
