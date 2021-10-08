package com.roombookingsystem.live;

public class Point {
    int x;
    int y;

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString()
    {
        return "( "+x +" , "+y+" )";
    }
}
