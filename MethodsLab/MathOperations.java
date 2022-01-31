package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");


        double firstNumber = Integer.parseInt(scanner.nextLine());
        String inputCommand = scanner.nextLine();
        double secondNumber = Integer.parseInt(scanner.nextLine());
        double result = 0;
            switch (inputCommand) {
            case "+":
                result = addThem(firstNumber, secondNumber);
                

                break;
            case "*":
                result = multiplyThem(firstNumber, secondNumber);
                break;
            case "-":
                result = subtractThem(firstNumber, secondNumber);
                break;
            case "/":
                result = divideThem(firstNumber, secondNumber);
                break;
        }
        System.out.println(decimalFormat.format(result));


    }

    public static double addThem(double enterFristNum, double enterSecondNum) {
        return enterFristNum + enterSecondNum;
    }

    public static double multiplyThem(double enterFristNum, double enterSecondNum) {

        return enterFristNum * enterSecondNum;
    }

    public static double subtractThem(double enterFristNum, double enterSecondNum) {

        return enterFristNum - enterSecondNum;
    }

    public static double divideThem(double enterFristNum, double enterSecondNum) {

        return enterFristNum / enterSecondNum;

    }

}



