package com.roombookingsystem.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class ResourceManager {
    @Autowired
    private ResourceBundleMessageSource messageSource;

    public String getMessage(String key) {
        return messageSource.getMessage(key, null, "no such key available", null);
    }
    public String getMessage(String key,String[] args) {
        return messageSource.getMessage(key, args, "no such key available", null);
    }
    public String getMessage(String key, String[] args, Locale locale) {
        return messageSource.getMessage(key, args, "no such key available", locale);
    }

    public void setMessageSource(ResourceBundleMessageSource messageSource) {
        this.messageSource = messageSource;
    }
}
