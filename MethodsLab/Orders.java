package MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        sumQuantity(product, quantity);
    }

    public static void sumQuantity(String enterProduct, int enterQuantity) {
        double result = 0;
        switch (enterProduct) {
            case "coffee":
                result = enterQuantity * 1.50;
                break;
            case "water":
                result = enterQuantity * 1.00;
                break;
            case "coke":
                result = enterQuantity * 1.40;
                break;
            case "snacks":
                result = enterQuantity * 2.00;
                break;
        }
        System.out.printf("%.2f", result);
    }
}
