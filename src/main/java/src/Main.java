// Main.java
package src;

import src.Splitwise.factory.ExpenseFactory;
import src.Splitwise.models.User;
import src.Splitwise.services.SplitService;
import src.Splitwise.strategies.SplitEqual;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Alice");
        User user2 = new User(2, "Nis");
        User user3 = new User(3, "Saurav");
        User user4 = new User(4, "Raj");

        // Initialize SplitService with ExpenseFactory
        SplitService splitService = new SplitService(new ExpenseFactory());

        splitService.addExpense(250, "Food", user1, new SplitEqual());
    }
}