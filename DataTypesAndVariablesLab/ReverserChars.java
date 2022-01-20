package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ReverserChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*
        Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.
*/
        String charOne = scanner.nextLine();
        String charTwo = scanner.nextLine();
        String charThree = scanner.nextLine();
        String allCharsInOne = charThree + " " + charTwo + " " + charOne;
        System.out.println(allCharsInOne);

    }
}
