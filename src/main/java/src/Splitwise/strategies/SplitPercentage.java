package src.Splitwise.strategies;

import src.Splitwise.models.Split;

import java.util.List;

public class SplitPercentage implements SplitStrategy {

    @Override
    public List<Split> split() {
        System.out.println("Splitting Percentage wise");
        return List.of();
    }
}
