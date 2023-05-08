package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainScene extends JFrame {
    public MainScene(){
        this.setBounds(0,0,Constants.SIMULATOR_WIDTH,Constants.SIMULATOR_HEIGHT);
        this.setLayout(null);
        ArrayList<Road> roads = RoadsList();

        this.add(new Junction(roads,null));
        for (Road road: roads) {
            this.add(road);
        }

        this.setVisible(true);
    }

    private ArrayList<Road> RoadsList(){
        ArrayList<Road> roads = new ArrayList<Road>();
        roads.add(new Road(-1,null,null,true, Color.RED));
        roads.add(new Road(0,null,null,true,Color.GREEN));
        roads.add(new Road(-1,null,null,false,Color.YELLOW));
        roads.add(new Road(0,null,null,false,Color.MAGENTA));
        return roads;
    }

}
