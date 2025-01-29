package src.Splitwise.strategies;

import src.Splitwise.models.Split;

import java.util.List;

public class SplitEqual implements SplitStrategy {
    @Override
    public List<Split> split() {

        System.out.println("Splitting Equal Strategy");

        return List.of();
    }
}
