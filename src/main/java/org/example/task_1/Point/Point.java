package org.example.task_1.Point;

public class Point implements Movable {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void moveUp(double shiftY) {
        this.y += shiftY;
    }

    @Override
    public void moveDown(double shiftY) {
        this.y -= shiftY;
    }

    @Override
    public void moveLeft(double shiftX) {
        this.x -= shiftX;
    }

    @Override
    public void moveRight(double shiftX) {
        this.x += shiftX;
    }
}
