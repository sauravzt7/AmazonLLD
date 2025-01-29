package src.Splitwise.models;

import src.Splitwise.creator.ExpenseCreator;
import src.Splitwise.strategies.SplitStrategy;

import java.util.List;

public class Expense {

    private SplitStrategy splitStrategy;
    private double amount;
    private String description;
    private User paidBy;
    private List<User> participants;
    List<Split> splits;

    public Expense(double amount, String description, User paidBy, List<User> participants, List<Split> splits) {
        this.amount = amount;
        this.description = description;
        this.paidBy = paidBy;
        this.participants = participants;
        this.splits = splits;

    }

    public Expense() {

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplit(List<Split> splits) {
        this.splits = splits;
    }


    @Override
    public String toString() {
        return "Expense{" +
                "amount=" + amount +
                ", description='" + description + '\'' +
                ", paidBy=" + (paidBy != null ? paidBy.getUsername() : "null") +
                ", participants=" + (participants != null ? participants.toString() : "null") +
                ", splits=" + (splits != null ? splits.toString() : "null") +
                '}';
    }
}
