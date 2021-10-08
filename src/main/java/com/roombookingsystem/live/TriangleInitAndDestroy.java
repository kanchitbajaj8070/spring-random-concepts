package com.roombookingsystem.live;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TriangleInitAndDestroy implements InitializingBean, DisposableBean {
    private Point point1;

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //called when bean is bring intialized
        System.out.println("initializing bean for triangle init class");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy of triangle init called");
        //shoutdown hook registered in main class is required
    }
}
