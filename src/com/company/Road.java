package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Road extends JPanel {
    private int direction;
    private ArrayList<Car> cars;
    private boolean isVertical;
    private Color color;



    public Road(int direction,ArrayList<Car> cars, TrafficLight trafficLight, boolean isVertical, Color color) {
        this.direction = direction;
        this.cars = cars;
        this.isVertical = isVertical;
        this.setLayout(null);
        if(this.isVertical){
           this.setBounds(Constants.SIMULATOR_WIDTH/2 + Constants.ROAD_BROADNESS * direction, 0,Constants.ROAD_BROADNESS,Constants.ROAD_LENGTH);
        }else{
            this.setBounds(0, Constants.SIMULATOR_HEIGHT/2 + Constants.ROAD_BROADNESS * direction,Constants.ROAD_LENGTH,Constants.ROAD_BROADNESS);
        }
        this.color = color;
        this.setBackground(this.color);

    }

    public Color getColor() {
        return color;
    }
}
