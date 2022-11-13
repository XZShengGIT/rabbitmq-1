package com.bjpowernode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Cors implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/web/**");
        registry.addMapping("/boot/**");
    }

   /* @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/web/**");
                registry.addMapping("/boot/**");
            }
        };
    }*/
//   @Bean
//   public WebMvcConfigurer webMvcConfigurer(){
//       return new WebMvcConfigurer() {
//           @Override
//           public void addInterceptors(InterceptorRegistry registry) {
//               registry.addInterceptor().addPathPatterns().excludePathPatterns();
//           }
//
//           @Override
//           public void configureViewResolvers(ViewResolverRegistry registry) {
//               registry.jsp()
//           }
//       };
//   }

}
