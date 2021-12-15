package com.company;
import java.util.ArrayList;

public class Busbar {
    private int position;
    private double timeOfWork;

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setTimeOfWork(double position) {
        this.timeOfWork = position;
    }

    public double getTimeOfWork() {
        return timeOfWork;
    }

    public void ShowTimeOfWork() {
        System.out.println("Выключатель №:" + getPosition() + "  Время срабатывания: " + getTimeOfWork() + " секунд");
    }


}

