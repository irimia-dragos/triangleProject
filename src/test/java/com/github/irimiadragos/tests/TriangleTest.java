package com.github.irimiadragos.tests;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TriangleTest
{
// positive tests
    @Test
    public void testEquilateral()
    {
        Triangle t = new Triangle(new String[]{"5", "5", "5"});
        assertEquals( TriangleType.EQUILATERAL, t.getType() );
    }

    @Test
    public void testIsoscele()
    {
        Triangle t = new Triangle(new String[]{"5", "5", "7"});
        assertEquals( TriangleType.ISOSCELES, t.getType() );
    }

    @Test
    public void testScalene()
    {
        Triangle t = new Triangle(new String[]{"3", "4", "5"});
        assertEquals( TriangleType.SCALENE, t.getType() );
    }

    // validation tests

    @Test(expected = TriangleInitializationError.class)
    public void testNotNumbersFirst()
    {
        Triangle t = new Triangle(new String[]{"3a", "4a", "5"});
    }


    @Test(expected = TriangleInitializationError.class)
    public void testNotNumbersSecond()
    {
        Triangle t = new Triangle(new String[]{"3", "a", "5"});
    }

    @Test(expected = TriangleInitializationError.class)
    public void testNotNumbersThird()
    {
        Triangle t = new Triangle(new String[]{"3", "4", "c"});
    }


    @Test(expected = TriangleInitializationError.class)
    public void testNotTriangle()
    {
        Triangle t = new Triangle(new String[]{"3", "9", "5"});
    }

    @Test(expected = TriangleInitializationError.class)
    public void testNegativeTriangle()
    {
        Triangle t = new Triangle(new String[]{"3", "-4", "5"});
    }
}
