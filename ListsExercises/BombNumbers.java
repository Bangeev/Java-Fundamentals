package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> bombAndPowerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int bomb = bombAndPowerList.get(0);
        int bombPower = bombAndPowerList.get(1);


        while (numsList.contains(bomb)){
            int bombPosition = numsList.indexOf(bomb);

            int leftBound = Math.max(0, bombPosition - bombPower);
            int rightBound = Math.min(numsList.size() - 1, bombPosition + bombPower);

            for (int i = rightBound; i >= leftBound; i--) {

                numsList.remove(i);

            }
        }
        int sum = 0 ;
        for (Integer element : numsList) {
            sum += element;
        }
        System.out.println(sum
        );



    }
}
