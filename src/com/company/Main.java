package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Busbar> busesnow = new ArrayList<>();
        Busbar buses[] = new Busbar[11];
        Busbar busbarForChange = new Busbar();

        Busbar b1 = new Busbar();
        Busbar b11 = new Busbar();
        Busbar b111 = new Busbar();
        Busbar b112 = new Busbar();
        Busbar b12 = new Busbar();
        Busbar b13 = new Busbar();
        Busbar b131 = new Busbar();
        Busbar b1311 = new Busbar();
        Busbar b1312 = new Busbar();
        Busbar b132 = new Busbar();


        b1.setPosition(1);
        b11.setPosition(11);
        b111.setPosition(111);
        b112.setPosition(112);
        b12.setPosition(12);
        b13.setPosition(13);
        b131.setPosition(131);
        b1311.setPosition(1311);
        b1312.setPosition(1312);
        b132.setPosition(132);

        b1.setTimeOfWork(-1);
        b11.setTimeOfWork(-1);
        b111.setTimeOfWork(3);
        b112.setTimeOfWork(5);
        b12.setTimeOfWork(4);
        b13.setTimeOfWork(-1);
        b131.setTimeOfWork(-1);
        b1311.setTimeOfWork(3);
        b1312.setTimeOfWork(6);
        b132.setTimeOfWork(3);

        buses[0] = b1;
        buses[1] = b11;
        buses[2] = b111;
        buses[3] = b112;
        buses[4] = b12;
        buses[5] = b13;
        buses[6] = b131;
        buses[7] = b1311;
        buses[8] = b1312;
        buses[9] = b132;
        buses[10] = busbarForChange;

        b1.setTimeOfWork(findTime(b1, buses));

        System.out.println("t(выкл1)= " + b1.getTimeOfWork());
        System.out.println("t(выкл11)= " + b11.getTimeOfWork());
        System.out.println("t(выкл12)= " + b12.getTimeOfWork());
        System.out.println("t(выкл13)= " + b13.getTimeOfWork());
        System.out.println("t(выкл131)= " + b131.getTimeOfWork());
    }


    public static double findTime(Busbar b, Busbar busess[]) {

        ArrayList<Busbar> busesnoww = new ArrayList<>();
        Busbar busbarForChange = busess[10];
        double tMax=0;

        for (int i = 0; i <= 10; i++) {
            if (((busess[i].getPosition()/10) == (b.getPosition()))) {
                busesnoww.add(busess[i]);
            }
        }

        for (int i=0; i<busesnoww.size(); i++) {
            busbarForChange=busesnoww.get(i);
            if (busbarForChange.getTimeOfWork() == -1) {
                busbarForChange.setTimeOfWork(findTime(busbarForChange, busess));
                busesnoww.set(i, busbarForChange);
            }
        }

        for (int i=0; i<busesnoww.size(); i++){
          if (busesnoww.get(i).getTimeOfWork()>tMax) {
                tMax = busesnoww.get(i).getTimeOfWork() + 0.5;
            }
        }
        return tMax;
    }
}










