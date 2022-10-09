package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    final double x;
    final double y;
    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
       return y;
    }


    public double getLength(Point point) {
        return  Math.sqrt(Math.pow(x - point.x, 2) + (Math.pow(y - point.y, 2)));
    }

}
