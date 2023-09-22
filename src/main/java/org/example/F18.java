package main.java.org.example;

public class F18 extends Airplaine {

    public String toString() {
        return "The plane has the id " + getId()+ "and is " + getLength() + "meters long, with a width of "
                + getWidth() + "meters. Also it is " + getWeigth() + "kg heavy.";
    }

    public F18(int id, int length, int width, int weight) {
        super(id, length, width, weight);
    }
}
