package models;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getX(double x){
        return x;
    }

    public double getY(double y){
        return y;
    }

    public double distance(Point end) {
        double vectx = this.x - end.x;
        double vecty = this.y - end.y;
        return Math.sqrt(vectx * vectx + vecty * vecty);
    }
    @Override
    public String toString() {
        return "x=" + x+ " " + "y=" + y;
    }
}