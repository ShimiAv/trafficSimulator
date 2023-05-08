package com.company;

import javax.swing.*;
import java.awt.*;

public class TrafficLight extends JPanel {
    private String direction;
    private Road road;
    private boolean isRed;
    private int horizontalDirection;
    private int verticalDirection;

    public TrafficLight(String direction, Road road, boolean isRed, int horizontalDirection, int verticalDirection){
        this.direction = direction;
        this.road = road;
        this.isRed = isRed;
        this.setBounds((Constants.ROAD_BROADNESS*2 - Constants.ROAD_BROADNESS/5) * horizontalDirection,(Constants.ROAD_BROADNESS*2 - Constants.ROAD_BROADNESS/5) * verticalDirection,Constants.ROAD_BROADNESS/5,Constants.ROAD_BROADNESS/5);
        this.setBackground(this.road.getColor());
        System.out.println(this.road.getColor());
    }


}
