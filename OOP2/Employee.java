public class Employee {
    String firstName,lastName;
    double salary;
    int floor,id;

    public Employee(String firstName, String lastName, double salary, int floor, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.floor = floor;
        this.id = id;
    }

    void raiseUpSalary(){
        this.salary = this.salary*1.10;
    }

    void changeFloor(int newFloor)
    {
        this.floor=newFloor;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", floor=" + floor +
                ", id=" + id +
                '}';
    }
}
