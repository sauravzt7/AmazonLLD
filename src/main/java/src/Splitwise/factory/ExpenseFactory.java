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
    public void createExpense(double amount, String description, User paidBy, SplitStrategy splitStrategy) {
        List<Split> splits = splitStrategy.split();
        Expense createdExpense = new Expense(amount, description, paidBy, splits);
        System.out.println("Expense created: " + createdExpense);
    }
}