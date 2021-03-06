package com.yulece.app.management.zuul.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.zuul")
public class ZuulProperties{

    private AuthProperties auth = new AuthProperties();

    private OAuth2Properties oauth = new OAuth2Properties();

    public OAuth2Properties getOauth() {
        return oauth;
    }

    public void setOauth(OAuth2Properties oauth) {
        this.oauth = oauth;
    }

    public AuthProperties getAuth() {
        return auth;
    }

    public void setAuth(AuthProperties auth) {
        this.auth = auth;
    }


}
