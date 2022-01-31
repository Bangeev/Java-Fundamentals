package MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputCommand = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (inputCommand) {
            case "add":
                addThem(firstNumber, secondNumber);
                break;
            case "multiply":
                multiplyThem(firstNumber, secondNumber);
                break;
            case "subtract":
                subtractThem(firstNumber, secondNumber);
                break;
            case "divide":
                divideThem(firstNumber, secondNumber);
                break;
        }


    }
    public static void addThem(int enterFristNum, int enterSecondNum){
        int result = enterFristNum + enterSecondNum;
        System.out.println(result);
    }
    public static void multiplyThem(int enterFristNum, int enterSecondNum){
        int result = enterFristNum * enterSecondNum;
        System.out.println(result);
    }
    public static void subtractThem(int enterFristNum, int enterSecondNum){
        int result = enterFristNum - enterSecondNum;
        System.out.println(result);
    }
    public static void divideThem(int enterFristNum, int enterSecondNum){
        int result = enterFristNum / enterSecondNum;
        System.out.println(result);
    }

}
