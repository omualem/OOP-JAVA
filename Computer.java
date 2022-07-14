public class Computer {
    String model;
    int price;
    int numberOfProcessors;
    float screenSize;
    boolean isTurnOn;

    public Computer(String model, int price, int numberOfProcessors, float screenSize, boolean isTurnOn) {
        this.model = model;
        this.price = price;
        this.numberOfProcessors = numberOfProcessors;
        this.screenSize = screenSize;
        this.isTurnOn = isTurnOn;
    }

    @Override
    public String toString() {
        return "Model: "+model+",Price: "+price+", Number of prcs: "+numberOfProcessors+
                ", Screen size: "+screenSize+", Is  turn on: "+isTurnOn;
    }
}
