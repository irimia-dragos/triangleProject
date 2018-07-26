package com.github.irimiadragos.tests;

/**
 *
 * Generic triangle initialization error.
 * If the triangle class cannot be initialized, it will throw this kind of error, signaling that the triangle cannot be build.
 */
public class TriangleInitializationError extends Error {
    public TriangleInitializationError(NumberFormatException nfe){
        super(nfe);
    }

    public TriangleInitializationError(String message){
        super(message);
    }
}
