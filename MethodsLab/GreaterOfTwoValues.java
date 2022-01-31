package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputCommand = scanner.nextLine();



        switch (inputCommand){
            case "int":
                int numOne = Integer.parseInt(scanner.nextLine());
                int numTwo = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(numOne, numTwo));

                break;
            case "char":
                char charOne = scanner.nextLine().charAt(0);
                char charTwo = scanner.nextLine().charAt(0);
                System.out.println(getMax(charOne, charTwo));

                break;
            case "string":
                String stringOne = scanner.nextLine();
                String stringTwo = scanner.nextLine();
                System.out.println(getMax(stringOne, stringTwo));
                break;
        }





    }

    public static int getMax(int firstNum, int secondNum){
        if (firstNum > secondNum){
            return firstNum;
        }
        return secondNum;
    }
    public static char getMax(char firstChar, char secondChar){
        if (firstChar > secondChar){
            return firstChar;
        }
        return secondChar;
    }
    public static String getMax(String firstString, String secondString){
        if (firstString.compareTo(secondString) >= 0){
            return firstString;
        }
        return secondString;
    }
}
