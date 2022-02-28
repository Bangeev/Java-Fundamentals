package TextProcessingLab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String myString = scanner.nextLine();


        while (myString.contains(word)){
            myString = myString.replace(word, "");
        }
        System.out.println(myString);

    }
}
