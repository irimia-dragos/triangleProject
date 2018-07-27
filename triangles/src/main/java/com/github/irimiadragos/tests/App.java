package com.github.irimiadragos.tests;


/**
 * Start up class for the Triangle test;
 *
 * This is the main class in the jar file. It can be runned using java -jar parameter
 *
 */
public class App
{
    public static void main( String[] args )
    {
        try {
            Triangle triangle = new Triangle(parse(args));
            System.out.println("Given triangle is " + triangle.getType());
        }catch(TriangleInitializationError|IllegalArgumentException  tie){
            System.out.println(tie.getMessage());
        }
    }

    public static int[] parse(String args[]){
        int[] ints = new int[args.length];
        for(int i = 0; i < args.length; i++){
            try {
                ints[i] = Integer.parseInt(args[i]);
            }catch(NumberFormatException nfe){
                throw new IllegalArgumentException("Failed to parse " + args[i] + " please provide a number ");
            }
        }
        return ints;
    }
}
