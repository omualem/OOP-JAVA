public class BankAccount {
    String owner;
    double Dollars = 0;

    public BankAccount(String owner, double dollars) {
        this.owner = owner;
        Dollars = dollars;
    }

    @Override
    public String toString() {
        return "The owner is "+owner+", and he has "+Dollars+"$ in his account";
    }
}
