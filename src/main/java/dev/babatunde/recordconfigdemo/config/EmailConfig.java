package dev.babatunde.recordconfigdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "email" )
public record EmailConfig(String senderName,String senderEmail) {}