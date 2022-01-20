package DataTypesAndVariablesLab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*
        Write a program that reads 3 lines of input. On each line, you get a single character.
         Combine all the characters into one string and print it on the console.
*/
        String charOne = scanner.nextLine();
        String charTwo = scanner.nextLine();
        String charThree = scanner.nextLine();
        String allCharsInOne = charOne + charTwo + charThree;
        System.out.println(allCharsInOne);


    }
}
