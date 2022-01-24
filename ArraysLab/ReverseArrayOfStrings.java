package ArraysLab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2; i++) {

//            ТОП АЛОГОРИТЪМ ЗА ЗАМЯНА НА ЕЛЕМЕНТИ В Array;

            String oldElment = inputArr[i];

            inputArr[i] = inputArr[inputArr.length - 1 - i];

            inputArr[inputArr.length - 1 - i] = oldElment;


        }


        System.out.println(String.join(" ", inputArr));


    }
}
