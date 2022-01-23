package DataTypesAndVariablesMoreExercises;

import java.net.Inet4Address;
import java.util.Objects;
import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equals("END")){

            Scanner newScanner = new Scanner(input);

            if (newScanner.hasNextInt()){
                System.out.printf("%s is integer type%n", input);
            }else if (newScanner.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", input);
            }else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            }else if (newScanner.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n", input);
            }else if (newScanner.hasNextLine()) {
                System.out.printf("%s is string type%n", input);
            }

            input = scanner.nextLine();

        }
    }
}
