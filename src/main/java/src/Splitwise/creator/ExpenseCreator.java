package src.Splitwise.creator;

import src.Splitwise.models.User;
import src.Splitwise.strategies.SplitStrategy;

import java.util.List;

public interface ExpenseCreator {

    void createExpense(double amount, String description, User paidBy, List<User> participants, SplitStrategy splitStrategy);
}
