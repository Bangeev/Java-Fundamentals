package ObjectAndClassesLab.RandomizeWords;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputArr = scanner.nextLine().split(" ");

        Random random = new Random();

        for (int i = 0; i < inputArr.length; i++) {

            int x = random.nextInt(inputArr.length);
            int y = random.nextInt(inputArr.length);
            String oldIndex = inputArr[x];
            inputArr[x] = inputArr[y];
            inputArr[y] = oldIndex;



        }

        System.out.println(String.join(System.lineSeparator(), inputArr));
    }
}
