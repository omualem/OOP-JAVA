public class Vehicle {
    String make;
    int wheels;
    String color;


    public Vehicle(String make, int wheels, String color) {
        this.make = make;
        this.wheels = wheels;
        this.color = color;
    }

    void go(){}
    void brake(){}

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }
}
