package com.github.irimiadragos.tests;

/**
 * This class will map out various types of triangles.
 *
 */
public enum TriangleType {
    /**
     * This type of triangle has all it's sides as equals
     */
    EQUILATERAL,

    /**
     * This type of triangle has only two sides as equal
     */
    ISOSCELES,
    /**
     * This type of triangle will not have any side as equal
     */
    SCALENE;

    public String toString(){
        return super.toString().toLowerCase();
    }
}
