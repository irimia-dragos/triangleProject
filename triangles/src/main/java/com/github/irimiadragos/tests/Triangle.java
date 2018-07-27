package com.github.irimiadragos.tests;

/**
 * This is the triangle class.
 * It will map out any type of triangle.
 * The triangle will be build from it's sides values.
 * The triangle alwas has 3 sides. This class only takes integer as triangle sides values.
 *
 * This triangle class will validate that the parameters can form indeed a triangle.
 * This triangle calss is immutable.
 */
public final class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle(int... sides){
        initSides(sides);
    }

    /**
     * Initialization method for the triangle class.
     *
     * @param sides the triangle sides length
     */
    private void initSides(int... sides){
        if (sides.length < 3){
            throw new TriangleInitializationError("You didn't specify a triangle. Please provide 3 arguments. You are missing "  + (3 - sides.length) + " sides");
        } else if (sides.length > 3){
            throw new TriangleInitializationError("You didn't specify a triangle. Please provide only 3 arguments.");
        }
        for (int size : sides){
            if (size < 0 ){
                throw new TriangleInitializationError("A size cannot be negative, you must change the value " + size);
            } else if(size == 0){
                throw new TriangleInitializationError("A size cannot zero");
            }
        }
        a = sides[0];
        b = sides[1];
        c = sides[2];
        if (a  + b < c || a + c < b || b + c < a){
            throw new TriangleInitializationError("You didn't specify a triangle. Given parameters cannot be the sides of a triangle");
        }

    }

    /**
     * This class will get the type of the current triangle.
     *
     * @return the type of the triangle
     */
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
