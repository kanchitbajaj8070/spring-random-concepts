package com.roombookingsystem.live;

public class Rectangle {
    private String height;
    private String width;

    public Rectangle(String height, String width) {
        this.height = height;
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return width+" , "+height;
    }
}
