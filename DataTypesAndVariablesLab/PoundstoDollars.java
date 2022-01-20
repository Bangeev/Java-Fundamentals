package DataTypesAndVariablesLab;

import java.util.Scanner;

public class PoundstoDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputPounds = Double.parseDouble(scanner.nextLine());
        double poundsToUsd = inputPounds * 1.36;

        System.out.printf("%.3f", poundsToUsd);



    }



}
