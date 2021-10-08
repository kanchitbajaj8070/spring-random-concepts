package com.roombookingsystem.live;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class Triangle {

    private List<Point> pointList;

    public List<Point> getPointList() {
        return pointList;
    }

   @Required
    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }

    private void print()
    {
        System.out.println(pointList);
    }

}
