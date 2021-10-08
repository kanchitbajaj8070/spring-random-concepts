package com.roombookingsystem.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class TriangleAutowireWithQualifier {

    private Point point;

    public Point getPoint() {
        return point;
    }
    @Autowired
    @Qualifier("useDefault")
    public void setPoint(Point point) {
        this.point = point;
    }
}