package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<>();

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

    public double getAverageSide(){
        int size = points.size();
        return calculatePerimeter() / size;
    }

    public double getLongestSide(){
        double lons = 0, side;
        int size = points.size();
        for (int i = 0; i < size; i++){
            Point start = points.get(i);
            Point end = points.get((i+1)%size);
            side = start.distance(end);
            if (lons < side) {
                lons = side;
            }}
        return lons;
    }
}