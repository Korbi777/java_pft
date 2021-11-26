//package ru.stqa.pft.sandbox;
//
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.text.DecimalFormat;
//
//public class SquareTests {
//
//    @Test
//    public void testPoints () {
//        Point a = new Point(0,0);
//        Point b = new Point(0,5);
//
//        Assert.assertEquals(Point.distance(a,b), 5);
//    }
//
//    @Test
//    public void testPoints2 () {
//        Point a = new Point(1,4);
//        Point b = new Point(2,5);
//        double res = Point.distance(a,b);
//        DecimalFormat f = new DecimalFormat("#.##");
//        try {
//            double f1 = Double.parseDouble(f.format(res));
//            Assert.assertEquals(f1, 5.29);
//        } catch (NumberFormatException ex){
//            System.out.println(ex);
//        }
//    }
//
//    @Test
//    public void testPoints3 () {
//
//    }
//}
