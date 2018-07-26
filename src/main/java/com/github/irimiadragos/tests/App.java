package com.github.irimiadragos.tests;

public class App
{
    public static void main( String[] args )
    {
        try {
            Triangle triangle = Triangle.buildTriangle(args);
            System.out.println("Given triangle is " + triangle.getType());
        }catch(TriangleInitializationError tie){
            System.out.println(tie.getMessage());
        }

    }
}
