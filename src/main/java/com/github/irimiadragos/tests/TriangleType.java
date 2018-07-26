package com.github.irimiadragos.tests;

public enum TriangleType {
    EQUILATERAL, ISOSCELES , SCALENE;

    public String toString(){
        return super.toString().toLowerCase();
    }
}
