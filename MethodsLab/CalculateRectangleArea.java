package MethodsLab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        double result = calculateRectangleArea(width, length);
        System.out.printf("%.0f",result);
    }


    public static double calculateRectangleArea(int enterWidth, int enterLength){
        return enterWidth * enterLength;

    }



}
