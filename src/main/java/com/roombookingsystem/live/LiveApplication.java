package com.roombookingsystem.live;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import java.util.logging.Logger;

@SpringBootApplication
public class LiveApplication {
    private static Log logger = LogFactory.getLog(LiveApplication.class);

    public static void main(String[] args) {
//        ApplicationContext beanFactory=  new ClassPathXmlApplicationContext("context.xml");
        /*dont use springbean factory it depreceated*/
        AbstractApplicationContext beanFactory = new ClassPathXmlApplicationContext("context.xml");
        //changed to show init and destroy methods of spring
        beanFactory.registerShutdownHook();//to  close context when application closes. oveeriding init and destroy methods of beans♦
//        DemoClass demoClass = (DemoClass) beanFactory.getBean("demo");
//        logger.info("value of name in democlass is " + demoClass.getName());
//        Rectangle rectangle = (Rectangle) beanFactory.getBean("rect");
//        logger.info(String.format("rectangle height is %s , width is %s ", rectangle.getHeight(), rectangle.getWidth()));
//        Triangle triangle = (Triangle) beanFactory.getBean("triangle");
//        logger.info(triangle.getPointList());
//        logger.info(beanFactory.getBean("fruits-list"));
//        TriangleAutowire triangleAutowire = (TriangleAutowire) beanFactory.getBean("triangle-autowire");
//        logger.info("triangle atowire" + "  " + triangleAutowire.getPointList());
//        logger.info(triangleAutowire.getPoint1());
//        logger.info(demoClass.getApplicationContext().getBean("fruits-list"));
//        TriangleAutowireWithQualifier triangleAutowireWithQualifier=(TriangleAutowireWithQualifier) beanFactory.getBean("triangle-autowire-qualifier");
//        logger.info("  TriangleAutowireWithQualifier " + triangleAutowireWithQualifier.getPoint());
//        TriangleWithComponentScan triangleWithComponentScan = (TriangleWithComponentScan) beanFactory.getBean("triangleWithComponentScan");
//        logger.info("TriangleWithComponentScan " + triangleWithComponentScan.getRect().toString() + " ");
//logger.info(beanFactory.getMessage("myname",null,"default msg incase of key not found",null));
        TestResourceManager testResourceManager=(TestResourceManager)beanFactory.getBean("testResourceManager");
        testResourceManager.testMessages();
    }

}
