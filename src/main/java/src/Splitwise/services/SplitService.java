package src.Splitwise.services;

import src.Splitwise.creator.ExpenseCreator;
import src.Splitwise.models.User;
import src.Splitwise.strategies.SplitStrategy;

import java.util.List;

public class SplitService {

    private final ExpenseCreator expenseCreator;

    public SplitService(ExpenseCreator expenseCreator){
        this.expenseCreator = expenseCreator;
    }


    public void addExpense(double amount, String description, User paidBy, List<User> participants, SplitStrategy splitStrategy){
        expenseCreator.createExpense(amount, description, paidBy, participants, splitStrategy);
    }
}