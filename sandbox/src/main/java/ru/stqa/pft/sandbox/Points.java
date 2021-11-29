package ru.stqa.pft.sandbox;

public class Points {

    public static void main(String[] args) {
        Point p1 = new Point(-4,3);
        Point p2 = new Point(3,1);

        System.out.println("Дистанция между точками: " + "(" + p1.x + ";" + p1.y + ")" + " и " + "(" + p1.x + ";" + p2.y + ")" + " = " + p1.distance(p2));
    }
    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.y - p1.x) * (p2.y - p1.x) + (p2.y - p1.x)*(p2.y - p1.x));
    }
}