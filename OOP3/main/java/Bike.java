public class Bike extends Vehicle{
    public Bike(String make, int wheels, String color) {
        super(make, wheels, color);
    }

    @Override
    void go() {
        System.out.println(this.make+"running");
    }

    @Override
    void brake() {
        System.out.println("its not working");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "make='" + make + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }
}
