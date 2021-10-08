package com.roombookingsystem.live;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.time.LocalDateTime;

public class DemoClass implements ApplicationContextAware {
    private String name;

    private ApplicationContext applicationContext;

    public DemoClass() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
