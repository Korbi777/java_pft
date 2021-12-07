package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testPoints() {
        Point p1 = new Point(1,0);
        Point p2 = new Point(4,5);

        Assert.assertEquals(p1.distance(p2), 5.830951894845301);
    }

    @Test
    public void testPoints2() {
        Point p1 = new Point(1,0);
        Point p2 = new Point(4,5);

        Assert.assertNotEquals(p1.distance(p2), 2);
    }

}

