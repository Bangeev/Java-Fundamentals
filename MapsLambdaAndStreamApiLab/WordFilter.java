package MapsLambdaAndStreamApiLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> myList = Arrays.stream(scanner.nextLine().split(" "))
            .filter(e -> e.length() % 2 == 0).collect(Collectors.toList());

        System.out.println(String.join(System.lineSeparator(), myList));



    }
}
