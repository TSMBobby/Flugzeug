package main.java.org.example;

public class F14 extends Airplaine {

    public String toString() {
        return "The jet has the id " + getId() + "with the length of " + getLength() +
                "meters and the width of " + getWidth() + ". It weights " + getWeigth() + "kg.";
    }

    public F14(int id, int length, int width, int weight) {
        super(id, length, width, weight);
    }
}
