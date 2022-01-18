package BasicSyntaxConditionalStatementsandLoopsMoreExercises;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//    Write a method that returns the English name of the last digit of a given number.
//    Write a program that reads an integer and prints the returned value from this method.

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        int lastDigit = number % 10;

        String lastDigitString = "";

        if (lastDigit == 1) {
            lastDigitString = "one";
        } else if (lastDigit == 2) {
            lastDigitString = "two";
        } else if (lastDigit == 3) {
            lastDigitString = "three";
        } else if (lastDigit == 4) {
            lastDigitString = "four";
        } else if (lastDigit == 5) {
            lastDigitString = "five";
        }  else if (lastDigit == 6) {
            lastDigitString = "six";
        } else if (lastDigit == 7) {
            lastDigitString = "seven";
        } else if (lastDigit == 8) {
            lastDigitString = "eight";
        } else if (lastDigit == 9) {
            lastDigitString = "nine";
        } else if (lastDigit == 0) {
            lastDigitString = "zero";
        } else {
            lastDigitString = "null";
        }

        System.out.println(lastDigitString);





    }




}
