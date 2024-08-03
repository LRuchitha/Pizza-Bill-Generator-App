import java.util.Scanner;

public class PizzaBillGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza pizza = null;

        System.out.println("Welcome to Pizzamania!");
        System.out.println("1. Veg Pizza");
        System.out.println("2. Non-Veg Pizza");
        System.out.println("3. Delux Veg Pizza");
        System.out.println("4. Delux Non-Veg Pizza");
        System.out.print("Select the type of pizza: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                pizza = new VegPizza();
                break;
            case 2:
                pizza = new NonVegPizza();
                break;
            case 3:
                pizza = new DeluxVegPizza();
                break;
            case 4:
                pizza = new DeluxNonVegPizza();
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        if (choice == 1 || choice == 2) {
            System.out.print("Add extra cheese? (yes/no): ");
            String cheese = scanner.next();
            if (cheese.equalsIgnoreCase("yes")) {
                pizza.addExtraCheese();
            }

            System.out.print("Add extra toppings? (yes/no): ");
            String toppings = scanner.next();
            if (toppings.equalsIgnoreCase("yes")) {
                pizza.addExtraToppings();
            }
        }

        System.out.print("Opt for take away? (yes/no): ");
        String takeAway = scanner.next();
        if (takeAway.equalsIgnoreCase("yes")) {
            pizza.optForTakeAway();
        }

        System.out.println("Generating your bill...");
        System.out.println("===================================");
        System.out.println(pizza);
        System.out.println("Total Price: $" + pizza.calculatePrice());
        System.out.println("===================================");
    }
}
