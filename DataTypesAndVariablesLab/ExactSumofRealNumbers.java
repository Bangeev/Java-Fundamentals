package DataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumofRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Write a program to enter n numbers and calculate and print their exact sum (without rounding).

        int numCount = Integer.parseInt(scanner.nextLine());
        BigDecimal sumNumber = new BigDecimal(0);

        for (int i = 0; i < numCount; i++) {
            BigDecimal inputs = new BigDecimal(scanner.nextLine());
            sumNumber = sumNumber.add(inputs);


        }
        System.out.println(sumNumber);
    }
}
