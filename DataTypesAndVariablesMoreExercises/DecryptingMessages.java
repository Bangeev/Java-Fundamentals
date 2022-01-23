package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;


        for (int i = 1; i <= n ; i++) {
            char receiveChars = scanner.nextLine().charAt(0);
            result = receiveChars + key;
            System.out.print((char) result);

        }





    }
}
