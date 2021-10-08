package com.roombookingsystem.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TriangleWithComponentScan {

    @Autowired
    private Rectangle rect;

    public TriangleWithComponentScan(Rectangle rect) {
        this.rect=rect;
    }

    public Rectangle getRect() {
        return rect;
    }
}