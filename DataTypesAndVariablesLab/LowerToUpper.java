package DataTypesAndVariablesLab;

import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*
        Write a program that prints whether a given character is upper-case or lower-case.
*/
        char input = scanner.nextLine().charAt(0);
        if (Character.isUpperCase(input)){
            System.out.println("upper-case");
        }else System.out.println("lower-case");


    }
}
