package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.####");



        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());

        double result = mathPower(firstNum, secondNum);
        System.out.println(decimalFormat.format(result));

    }

    public static double mathPower(double enterNum, double enterSecondNum){
        return Math.pow(enterNum, enterSecondNum);

    }
}
