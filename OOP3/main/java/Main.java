public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("ford",4,"white");
        Car c1 = new Car("mazda",5,"red","cx5",180,3);
        Truck t1 = new Truck("daff",8,"black","cfr1",28);
        Bike b1 = new Bike("honda",2,"blue");

        Vehicle t2 = new Car("mazda",5,"red","cx5",180,3);
        Vehicle[] vv = new Vehicle[3];
        vv[0]=c1;
        vv[1]=b1;
        vv[2]=c1;

        Animal[] animal = new Animal[2];
        Animal a1 = new Animal("Bobi");
        Dog d1 = new Dog("Joy");
        Cat cat1 = new Cat("Mizi");
        animal[0]=a1;
        animal[1]=d1;
        animal[2]=cat1;

    }
}
