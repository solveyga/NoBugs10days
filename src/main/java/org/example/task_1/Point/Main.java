package org.example.task_1.Point;

public class Main {
    public static void main(String[] args){
        Point point = new Point();
        point.setX(0.0);
        point.setY(0.0);

        point.moveUp(1.1);
        point.moveLeft(2.4);

        System.out.println("x = " + point.getX() + ", y = " + point.getY());
    }
}
