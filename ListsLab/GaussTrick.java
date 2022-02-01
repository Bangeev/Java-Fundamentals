package ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int size = numsList.size();

        for (int i = 0; i < size / 2; i++) {

            numsList.set(i, numsList.get(i) + numsList.get(numsList.size() - 1));
            numsList.remove(numsList.size() - 1);

        }


        for (int element : numsList) {
            System.out.print(element + " ");
        }

    }
}
