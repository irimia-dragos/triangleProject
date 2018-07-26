package com.github.irimiadragos.tests;

public class TriangleInitializationError extends Error {
    public TriangleInitializationError(NumberFormatException nfe){
        super(nfe);
    }

    public TriangleInitializationError(String message){
        super(message);
    }
}
