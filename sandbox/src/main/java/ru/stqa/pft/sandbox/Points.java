package ru.stqa.pft.sandbox;

public class Points {

    public static void main(String[] args) {
        Point p = new Point(-5,7,2,-2);

        System.out.println("Дистанция между точками: " + "(" + p.x1 + ";" + p.x2 + ")" + " и " + "(" + p.y1 + ";" + p.y2 + ")" + " = " + p.distance());
    }
}