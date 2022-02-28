package TextProcessingLab;

import java.util.Locale;
import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();
        StringBuilder nums = new StringBuilder();

        for (Character elemetn : input.toCharArray()){

            if (Character.isDigit(elemetn)){
                nums.append(elemetn);
            }else if (Character.isLetter(elemetn)){
                letters.append(elemetn);

            }else {
                symbols.append(elemetn);
            }
        }
        System.out.println(nums);
        System.out.println(letters);
        System.out.println(symbols);


    }
}
