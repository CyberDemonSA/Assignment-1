package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> ArrayListPoint;
    public ArrayList<Double> side;

    public void addPoint(Point point){
        ArrayListPoint.add(point);
    }

    public void distanceTo(ArrayList<Point> ArrayListPoint){
        int i = 0;
        while (ArrayListPoint.size()-1 > i){
            double a=ArrayListPoint[i].x-ArrayListPoint[i+1].x;
            double b=ArrayListPoint[i].y-ArrayListPoint[i+1].y;
            side.add(Math.sqrt());
        }
    }

    // calculatePerimeter()

    // getAverageSide()

    // getLongestSide()
}