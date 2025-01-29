package src.Splitwise.strategies;

import src.Splitwise.models.Split;
import src.Splitwise.models.User;

import java.util.List;

public class SplitPercentage implements SplitStrategy {

    @Override
    public List<Split> split(double amount, List<User> users) {
        System.out.println("Splitting Percentage wise");
        return List.of();
    }
}
