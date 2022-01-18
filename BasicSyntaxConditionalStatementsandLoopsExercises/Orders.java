package BasicSyntaxConditionalStatementsandLoopsExercises;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int receveOrders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;


        for (int i = 0; i < receveOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            //Price for one order
            double currentOrderPrice = (daysInMonth * capsulesCount) * pricePerCapsule;
            //if receveOrders is more 1 we are starting sum na orders in total price
            totalPrice += currentOrderPrice;

            System.out.printf("The price for the coffee is: $%.2f%n", currentOrderPrice);
        }
        System.out.printf("Total: $%.2f", totalPrice);

    }
}
