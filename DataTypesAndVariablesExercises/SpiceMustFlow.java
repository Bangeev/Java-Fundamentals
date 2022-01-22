package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int totalConsume = 0;
        int daysCounter = 0;
        int workersConsume = 0;


        if (startingYield < 100) {
            System.out.printf("%d%n%d", daysCounter, totalConsume);
        } else {
            while (startingYield >= 100) {
                daysCounter++;

                workersConsume = startingYield - 26;

                startingYield -= 10;
                totalConsume += workersConsume;
            }

            System.out.printf("%d%n%d", daysCounter, totalConsume - 26);


        }
    }
}
