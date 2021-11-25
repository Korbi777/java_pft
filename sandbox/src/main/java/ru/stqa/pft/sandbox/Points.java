package ru.stqa.pft.sandbox;

public class Points {

    public static void main(String[] args) {
        Point p1 = new Point(3,7);
        Point p2 = new Point(2,-6);

        System.out.println("Дистанция между точками: " + "(" + p1.x1 + ";" + p1.x2 + ")" + " и " + "(" + p2.x1 + ";" + p2.x2 + ")" + " = " + Point.distance(p1,p2));
    }
}