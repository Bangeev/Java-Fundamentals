package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfLines = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= numberOfLines ; i++) {
            long leftLong = Long.parseLong(scanner.next());
            long rightLong = Long.parseLong(scanner.next());
            long sum = 0;
            if (leftLong > rightLong){
                 long longLeft = leftLong;
                 while(longLeft != 0) {
                     sum += longLeft % 10;
                     longLeft /= 10;
                 }
            }else {

                long longRight = rightLong;
                while (longRight != 0) {
                    sum += longRight % 10;
                    longRight /= 10;
                }
            }

            System.out.println(Math.abs(sum));

        }



    }
}
