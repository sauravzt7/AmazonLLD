package src.Splitwise.models;

public class Split {

    private double amount;
    private User owedUser;


    public Split(double amount, User user) {
        this.amount = amount;
        this.owedUser = user;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getOwedUser() {
        return owedUser;
    }

    public void setOwedUser(User owedUser) {
        this.owedUser = owedUser;
    }

    @Override
    public String toString(){
        return "Split{" +
                "amount=" + amount +
                ", owedUser=" + (owedUser != null ? owedUser.getUsername() : "null") +
                '}';
    }
}
