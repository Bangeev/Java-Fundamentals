package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        On the first line of input, you will receive the char index you should start with, and on the
        second line - the index of the last character you should print.
*/


        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int numers = firstNumber; numers <= secondNumber ; numers++) {
            char result = (char)numers;
            System.out.print(result + " ");
        }



    }
}
