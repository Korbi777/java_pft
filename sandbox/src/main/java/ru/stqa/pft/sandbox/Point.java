package ru.stqa.pft.sandbox;

class Point {
    public double x;
    public double y;


    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public double distance(Point p) {
        return Math.sqrt((this.y - this.x) * (this.y - this.x) + (this.y - this.x)*(this.y - this.x));
    }

}