// ExpenseFactory.java
package src.Splitwise.factory;

import src.Splitwise.creator.ExpenseCreator;
import src.Splitwise.models.Expense;
import src.Splitwise.models.Split;
import src.Splitwise.models.User;
import src.Splitwise.strategies.SplitStrategy;

import java.util.List;

public class ExpenseFactory implements ExpenseCreator {

    @Override
    public void createExpense(double amount, String description, User paidBy, List<User> participants, SplitStrategy splitStrategy) {
        List<Split> splits = splitStrategy.split(amount, participants);
        Expense createdExpense = new Expense(amount, description, paidBy, participants, splits);
        System.out.println("Expense created: " + createdExpense.toString());
    }
}