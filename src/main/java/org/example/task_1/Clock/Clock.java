package org.example.task_1.Clock;
// Здесь нужно ограничение по секундам, минутам и часам и форматирование вывода, чтобы значения меньше 10 отображались двумя позициями
public class Clock implements Readable {
    private int hours;
    private int minutes;
    private int secundes;

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSecundes(int secundes) {
        this.secundes = secundes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecundes() {
        return secundes;
    }

    public void tick() {
        this.secundes += 1;
    }

    @Override
    public void readTime() {
        System.out.println(this.hours + ":" + this.minutes + ":" + this.secundes);
    }
}
