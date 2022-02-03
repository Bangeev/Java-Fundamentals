package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstCardsList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondCardsList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        while (!firstCardsList.isEmpty() || !secondCardsList.isEmpty()) {
            int firstCard = firstCardsList.get(0);
            int secondCard = secondCardsList.get(0);

            if (firstCard == secondCard) {
                firstCardsList.remove(0);
                secondCardsList.remove(0);
            } else if (firstCard > secondCard) {
                firstCardsList.add(firstCard);
                firstCardsList.add((secondCard));
                firstCardsList.remove(0);
                secondCardsList.remove(0);
            } else {
                secondCardsList.add(secondCard);
                secondCardsList.add(firstCard);
                secondCardsList.remove(0);
                firstCardsList.remove(0);


            }
            if (firstCardsList.isEmpty()){
               int sum =  secondCardsList.stream().mapToInt(Integer::intValue).sum();
                System.out.println("Second player wins! Sum: " + sum);
                break;
            }else if (secondCardsList.isEmpty()){
                int sum =  firstCardsList.stream().mapToInt(Integer::intValue).sum();
                System.out.println("First player wins! Sum: " + sum);
                break;
            }
        }
    }
}
