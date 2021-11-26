package ru.stqa.pft.sandbox;

class Point {
    public double x1;
    public double x2;

    public Point(double x1, double x2) {
        this.x1=x1;
        this.x2=x2;
    }

    public double distance() {
        return Math.sqrt((this.x2 - this.x1) * (this.x2 - this.x1) + (this.x2 - this.x1)*(this.x2 - this.x1));
    }
}