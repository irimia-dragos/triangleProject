package com.github.irimiadragos.tests;


import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class AppTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNotNumbersFirst()
    {
        App.parse(new String[]{"3a", "4a", "5"});
    }


    @Test(expected = IllegalArgumentException.class)
    public void testNotNumbersSecond()
    {
        App.parse(new String[]{"3", "a", "5"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNotNumbersThird()
    {
        App.parse(new String[]{"3", "4", "c"});
    }

    @Test
    public void testNumbersThird()
    {
        int[] result = App.parse(new String[]{"1", "2", "3", "4"});
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }
}
