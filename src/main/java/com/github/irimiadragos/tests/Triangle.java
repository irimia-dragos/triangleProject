package com.github.irimiadragos.tests;

public final class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle(String sides[]){
        initSides(sides);
    }

    public static Triangle buildTriangle(String sides[]){
        return new Triangle(sides);
    }

    public void initSides(String[] sides){
        if (sides.length < 3){
            throw new TriangleInitializationError("You didn't specify a triangle. Please provide 3 arguments. You are missing "  + (3 - sides.length) + " sides");
        } else if (sides.length > 3){
            throw new TriangleInitializationError("You didn't specify a triangle. Please provide only 3 arguments.");
        }
        try {
            a = Integer.parseInt(sides[0]);
            b = Integer.parseInt(sides[1]);
            c = Integer.parseInt(sides[2]);
            if (a  + b < c || a + c < b || b + c < a){
                throw new TriangleInitializationError("You didn't specify a triangle. Given parameters cannot be the sides of a triangle");
            }
        }catch(NumberFormatException nfe){
            throw new TriangleInitializationError(nfe);
        }
    }

    public TriangleType getType() {
        if (a == b && a == c){
            return TriangleType.EQUILATERAL;
        } else if (a != b  && a != c && b != c){
            return TriangleType.SCALENE;
        } else {
            return TriangleType.ISOSCELES;
        }
    }
}
