package org.example.task_1.Clock;

public class Main {
    public static void main(String[] args){
        Clock clock_1 = new Clock();
        clock_1.setHours(00);
        clock_1.setMinutes(20);
        clock_1.setSecundes(30);

        clock_1.tick();
        clock_1.tick();
        clock_1.tick();
        clock_1.tick();
        clock_1.tick();

        clock_1.readTime();
    }
}
