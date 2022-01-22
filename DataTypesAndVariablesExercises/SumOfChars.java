package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class SumOfChars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfChars = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int chars = 1; chars <= numberOfChars; chars++) {
            char enterChar = scanner.nextLine().charAt(0);
            sum+= (int)enterChar;

        }
        System.out.println("The sum equals: " + sum);







    }
}
