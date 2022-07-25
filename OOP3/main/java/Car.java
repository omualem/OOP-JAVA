public class Car extends Vehicle {
    String model;
    int hp;
    int service;

    public Car(String make, int wheels, String color, String model, int hp, int service) {
        super(make, wheels, color);
        this.model = model;
        this.hp = hp;
        this.service = service;
    }

    @Override
    void go() {
        System.out.println("voooooommmmmmm!!!!");
    }

    @Override
    void brake() {
        System.out.println("brakkkkking");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", hp=" + hp +
                ", service=" + service +
                ", make='" + make + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }
}
