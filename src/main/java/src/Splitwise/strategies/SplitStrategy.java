package src.Splitwise.strategies;

import src.Splitwise.models.Split;
import src.Splitwise.models.User;

import java.util.List;

public interface SplitStrategy {

    public List<Split> split(double amount, List<User> users);

}
