package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Junction extends JPanel {
    private ArrayList<Road> roads;
    private ArrayList<Pedestrian> pedestrians;
    private ArrayList<TrafficLight> trafficLights;

    public Junction(ArrayList<Road> roads, ArrayList<Pedestrian> pedestrians) {
        this.setBounds(Constants.SIMULATOR_WIDTH/2 - Constants.ROAD_BROADNESS,Constants.SIMULATOR_WIDTH/2 - Constants.ROAD_BROADNESS,Constants.ROAD_BROADNESS*2,Constants.ROAD_BROADNESS*2);
        this.setBackground(Color.BLACK);
        this.roads = roads;
        this.pedestrians = pedestrians;
        this.setLayout(null);
        this.add(new TrafficLight("k",roads.get(Constants.EAST_ROAD),true,0,1));
        this.add(new TrafficLight("k",roads.get(Constants.SOUTH_ROAD),true,0,0));
        this.add(new TrafficLight("k",roads.get(Constants.WEST_ROAD),true,1,0));
        this.add(new TrafficLight("k",roads.get(Constants.NORTH_ROAD),true,1,1));
    }


}
