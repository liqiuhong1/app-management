package com.yulece.app.management.zuul;

import com.yulece.app.management.zuul.properties.ZuulProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableConfigurationProperties(ZuulProperties.class)
@EnableWebSecurity
public class AppOauthApplicationBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(AppOauthApplicationBootstrap.class,args);
    }

}

