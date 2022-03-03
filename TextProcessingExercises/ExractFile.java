package TextProcessingExercises;

import java.util.Scanner;

public class ExractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");

        String[] fileName = input[input.length - 1].split("\\.");

        String name = fileName[0];
        String ext = fileName[1];


        System.out.println("File name: " + name);
        System.out.println("File extension: " + ext);




    }
}
