package com.qyh.tpsofbd.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:config/application.properties"})
@ConfigurationProperties(prefix = "test")
public class ServerSettings {

    //@Value("${name}")
    private String name;

    //@Value("domain")
    private String domain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
