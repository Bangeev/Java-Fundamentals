package MethodsLab;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enterNum = Integer.parseInt(scanner.nextLine());
        signOfInteger(enterNum);



    }

    public static void signOfInteger(int num){
        if (num > 0){
            System.out.printf("The number %d is positive.", num);
        }else if (num < 0){
            System.out.printf("The number %d is negative.", num);
        }else {
            System.out.println("The number 0 is zero.");
        }

    }
}
