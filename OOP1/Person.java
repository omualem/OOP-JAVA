import java.util.Date;

public class Person {
    String name;
    Date birthdate;

    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "My name is "+ name +", and I was born at "+birthdate;
    }
}
