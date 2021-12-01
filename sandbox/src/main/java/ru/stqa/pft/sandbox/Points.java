package ru.stqa.pft.sandbox;

public class Points {

    public static void main(String[] args) {
        Point p1 = new Point(-4,5);
        Point p2 = new Point(3,2);

        System.out.println("Дистанция между точками: " + "(" + p1.x + ";" + p1.y + ")" + " и " + "(" + p2.x + ";" + p2.y + ")" + " = " + p1.distance(p2));
    }
}
