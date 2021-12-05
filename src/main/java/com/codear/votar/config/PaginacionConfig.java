package com.codear.votar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PaginacionConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/inicio").setViewName("inicio");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/panel").setViewName("panel");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/registro").setViewName("registro");
        registry.addViewController("/perfil").setViewName("perfil");
        registry.addViewController("/auspiciantes").setViewName("auspiciantes");
        registry.addViewController("/emprendimientos").setViewName("emprendimientos");
        registry.addViewController("/eventos").setViewName("eventos");
        registry.addViewController("/usuarios").setViewName("usuarios");

    }

}