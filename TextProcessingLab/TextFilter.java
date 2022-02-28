package TextProcessingLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] banngedWords = scanner.nextLine().split(", ");


        String text = scanner.nextLine();
        for (String element : banngedWords) {

            while (text.contains(element)){
                text = text.replaceAll(element, elementStarscount(element));
            }

        }
        System.out.println(text);
    }

    private static String elementStarscount(String element) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < element.length(); i++) {
            sb.append("*");
        }
        return sb.toString();
    }
}
