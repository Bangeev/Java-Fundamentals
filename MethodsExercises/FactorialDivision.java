package MethodsExercises;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        double inputTwo = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f", factorialOfTwoNums(input) / factorialOfTwoNums(inputTwo));



    }
    private static double factorialOfTwoNums(double num){
        double result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }


}
