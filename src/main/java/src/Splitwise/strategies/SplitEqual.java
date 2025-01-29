package src.Splitwise.strategies;

import src.Splitwise.models.Split;
import src.Splitwise.models.User;

import java.util.ArrayList;
import java.util.List;

public class SplitEqual implements SplitStrategy {
    @Override
    public List<Split> split(double amount, List<User> users) {

        List<Split> splitList = new ArrayList<>();
        double totalAmount = amount;
        double splitAmount = totalAmount / users.size();

        for (User user : users) {
            Split split = new Split(splitAmount, user);
            splitList.add(split);
        }

        System.out.println("Splitting Equal Strategy");

        return splitList;
    }
}
