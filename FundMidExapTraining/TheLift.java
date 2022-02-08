package FundMidExapTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int people = Integer.parseInt(scanner.nextLine());
        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        for (int i = 0; i < numsList.size(); i++) {

            if (numsList.get(i) < 4) {
                if (people >= 4 - numsList.get(i)) {
                    people -= 4 - numsList.get(i);
                    numsList.set(i, 4);
                } else {
                    numsList.set(i, numsList.get(i) + people);
                    people = 0;
                }
            }


        }
        boolean full = IntStream.range(0, numsList.size()).noneMatch(i -> numsList.get(i) != 4);
        if (people == 0 && !full) {
            System.out.println("The lift has empty spots!");
        } else if (people > 0 && full) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
        }
        System.out.print(numsList.toString().replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
}