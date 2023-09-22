package main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public void main(String[] args) {
        List <Airplaine> airplaines = new ArrayList<>();

        F18 f18 = new F18(1,13,4,1500);
        F14 f14 = new F14(2,10,3,1000);

        airplaines.add(f18);
        airplaines.add(f14);

        for(Airplaine airplaine: airplaines) {
            System.out.println(airplaine.toString());
        }
    }
}
