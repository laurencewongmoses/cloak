package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class CloakApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(CloakApplication.class, args);

    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CloakApplication.class);
    }

//    @Bean
//    public EmbeddedServletContainerCustomizer containerCustomizer() {
//
//        return (container) -> {
//            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/static/404.html");
//            ErrorPage error403Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/static/403.html");
//            ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/static/500.html");
//            container.addErrorPages(error403Page, error404Page, error500Page);
//        };
//    }
}
