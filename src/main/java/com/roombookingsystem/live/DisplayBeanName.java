package com.roombookingsystem.live;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayBeanName implements BeanPostProcessor {
    Log log= LogFactory.getLog("Bean PostProcessor");
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("called before intialization of "+beanName+" bean");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("called after intialization of "+beanName+" bean");
        return bean;
    }
}
