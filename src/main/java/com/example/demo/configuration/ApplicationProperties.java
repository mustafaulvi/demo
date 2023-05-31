package com.example.demo.configuration;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("api")
public class ApplicationProperties {
    private String version;
    private String title;
    private String basePackage;
    private String description;
    private String terms;
}
