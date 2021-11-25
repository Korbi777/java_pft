package ru.stqa.pft.sandbox;

class Point {
    public double x1;
    public double x2;

    public Point(double x1, double x2) {
        this.x1=x1;
        this.x2=x2;

    }

    public static double distance (Point p1, Point p2) {
        return Math.sqrt((p1.x2 - p1.x1) * (p2.x2 - p1.x1) + (p2.x2 - p1.x1)*(p2.x2 - p1.x1));
    }

}