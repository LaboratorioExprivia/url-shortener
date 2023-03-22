package com.github.PopovDmitry.urlshortener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class UrlShortenerApplication extends SpringBootServletInitializer {


    public static void main(String[] args) {
		SpringApplication.run(UrlShortenerApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(serverTestApplication.class);
    }
}
