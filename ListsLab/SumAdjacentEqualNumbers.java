package ListsLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numsList.size() - 1; i++) {
            if (numsList.get(i).equals(numsList.get(i + 1))){
                numsList.set(i, numsList.get(i) + numsList.get(i + 1));
                numsList.remove(i + 1);

                i = -1;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.#");

        for (double elemten : numsList){
            System.out.print(decimalFormat.format(elemten) + " ");
        }

    }

}
