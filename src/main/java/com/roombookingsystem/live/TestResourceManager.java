package com.roombookingsystem.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class TestResourceManager {
    @Autowired
    private ResourceManager resourceManager;

    public void testMessages() {
        System.out.println(resourceManager.getMessage("myname"));
        System.out.println(resourceManager.getMessage("myEmail"));
        System.out.println(resourceManager.getMessage("myPhone"));
        System.out.println(resourceManager.getMessage("pointd.pointx"));
        System.out.println(resourceManager.getMessage("pointd.pointy"));
        System.out.println(resourceManager.getMessage("anythingOtherThankKey"));
        System.out.println(resourceManager.getMessage("myFullName",new String[]{"kunal","bajaj"}));
        System.out.println(resourceManager.getMessage("myFullName",new String[]{"kunal","bajaj"}, Locale.SIMPLIFIED_CHINESE));
        System.out.println();
    }

    public void setResourceManager(ResourceManager resourceManager) {
        this.resourceManager = resourceManager;
    }
}
