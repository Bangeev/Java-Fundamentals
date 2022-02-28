package TextProcessingLab;

import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());

        while (!stringBuilder.toString().equals("end")){
            StringBuilder result = new StringBuilder();
            for (int i = stringBuilder.toString().length() - 1; i >= 0; i--) {
                result.append(stringBuilder.toString().charAt(i));
            }

            System.out.println(stringBuilder + " = " + result);

            stringBuilder = new StringBuilder(scanner.nextLine());
        }



    }
}
