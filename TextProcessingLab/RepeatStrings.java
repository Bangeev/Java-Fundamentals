package TextProcessingLab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder word = new StringBuilder();
        String[] text = scanner.nextLine().split(" ");

        for (String e : text){
            for (int i = 0; i < e.length(); i++) {
                word.append(e);
            }

        }

        System.out.println(word);




    }
}
