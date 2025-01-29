package src.Splitwise.creator;

import src.Splitwise.models.User;
import src.Splitwise.strategies.SplitStrategy;

public interface ExpenseCreator {

    void createExpense(double amount, String description, User paidBy, SplitStrategy splitStrategy);
}
