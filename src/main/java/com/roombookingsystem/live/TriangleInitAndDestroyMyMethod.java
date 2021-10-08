package com.roombookingsystem.live;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TriangleInitAndDestroyMyMethod  {
    private Point point1;

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void myinit() throws Exception {
        //called when bean is bring intialized
        System.out.println("initializing bean for triangle init class");
    }

    public void myDestroy() throws Exception {
        System.out.println("destroy of triangle init called");
        //shoutdown hook registered in main class is required 
    }
}
