package model;

public class Car {

    private String model;
    private int number;
    private int speed;

    public Car(String model, int number, int speed) {
        this.model = model;
        this.number = number;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "model="+getModel()+" number="+getNumber()+" speed="+getSpeed();
    }
}
