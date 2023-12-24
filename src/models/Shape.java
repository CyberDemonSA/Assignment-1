package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;
    public ArrayList<Double> side;

    public void addPoint(Point point){
        points.add(point);
    }

    public double calculatePerimeter(){
        double P = 0;
        int size = points.size();
        for (int i = 0; i < size; i++){
            Point start = points.get(i);
            Point end = points.get((i+1)%size);
            P += start.distance(end);
        }
        return P;
    }


}