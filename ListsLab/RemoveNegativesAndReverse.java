package ListsLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        numsList.removeIf(integer -> integer < 0);
        Collections.reverse(numsList);
        if (numsList.isEmpty()) {
            System.out.println("empty");
        } else {
            for (int element : numsList) {
                System.out.print(element + " ");
            }


        }
    }
}
