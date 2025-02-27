package org.example.data;

public class Coordinates {
    private double x; //Максимальное значение поля: 909
    private long y;

    public Coordinates(double x, long y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates() {}

    public double getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(long y) {
        this.y = y;
    }
}
