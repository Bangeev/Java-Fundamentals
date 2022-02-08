package FundMidExapTraining;

import java.util.Objects;
import java.util.Scanner;

public class ComputerStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double beforeToralPrice = 0;
        double totalPrice = 0;
        double taxes = 0;
        double sumPartsWithoutTax = 0;
        while (true) {

            String partPricesWithoutTax = scanner.nextLine();

            if (partPricesWithoutTax.equals("regular")) {

                taxes = sumPartsWithoutTax * 0.2;
                totalPrice = sumPartsWithoutTax + taxes;

                if (totalPrice == 0) {
                    System.out.println("Invalid order!");
                    break;

                } else {
                    System.out.println("Congratulations you've just bought a new computer!");
                    System.out.printf("Price without taxes: %.2f$%n", sumPartsWithoutTax);
                    System.out.printf("Taxes: %.2f$%n", taxes);
                    System.out.println("-----------");
                    System.out.printf("Total price: %.2f$%n", totalPrice);
                    return;

                }

            } else if (partPricesWithoutTax.equals("special")) {

                taxes = sumPartsWithoutTax * 0.2;
                totalPrice = sumPartsWithoutTax + taxes;
                totalPrice *= 0.9;

                if (totalPrice == 0) {
                    System.out.println("Invalid order!");
                    break;
                } else {
                    System.out.println("Congratulations you've just bought a new computer!");
                    System.out.printf("Price without taxes: %.2f$%n", sumPartsWithoutTax);
                    System.out.printf("Taxes: %.2f$%n", taxes);
                    System.out.println("-----------");
                    System.out.printf("Total price: %.2f$%n", totalPrice);
                    return;
                }


            } else {
                if (Double.parseDouble(partPricesWithoutTax) < 0) {
                    System.out.println("Invalid price!");
                    continue;
                }
            }

            sumPartsWithoutTax += Double.parseDouble(partPricesWithoutTax);

        }


    }


}
