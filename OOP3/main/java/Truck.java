public class Truck extends Vehicle{
    String model;
    int weight;

    public Truck(String make, int wheels, String color, String model, int weight) {
        super(make, wheels, color);
        this.model = model;
        this.weight = weight;
    }

    @Override
    void go() {
        System.out.println("its hot here i aa truck");
    }

    @Override
    void brake() {
        System.out.println("some stupid ran over me");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", make='" + make + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }
}
