package MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeatNum = Integer.parseInt(scanner.nextLine());

        String result = repeatString(input, repeatNum);
        System.out.printf("%s",result);

    }

    public static String repeatString(String enterString, int enterRepeatTimes){
        String result = "";
        for (int i = 1; i <= enterRepeatTimes; i++) {
          result += enterString;
        }

        return result;
    }



}
