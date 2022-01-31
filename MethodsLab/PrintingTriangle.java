package MethodsLab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enterEnd = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= enterEnd; i++) {
            printTriangle(1, i);
        }
        for (int i = enterEnd - 1; i >= 1; i--) {
            printTriangle(1, i);
        }


    }

    public static void printTriangle(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
