package main.java.org.example;

public class Airplaine {

    private int id;
    private int length;
    private int width;
    private int weigth;

    public int getId() {
        return id;
    }

    public Airplaine setId(int id) {
        this.id = id;
        return this;
    }

    public int getLength() {
        return length;
    }

    public Airplaine setLength(int length) {
        this.length = length;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Airplaine setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getWeigth() {
        return weigth;
    }

    public Airplaine setWeigth(int weigth) {
        this.weigth = weigth;
        return this;
    }

    public Airplaine(int id, int length, int width, int weigth) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.weigth = weigth;
    }
}
