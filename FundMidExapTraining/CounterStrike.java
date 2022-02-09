package FundMidExapTraining;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());


        int counter = 0;

        String command = scanner.nextLine();


        int reducedEnergy = energy;


        while (!command.equals("End of battle")) {
            int distanceNum = Integer.parseInt(command);
            if (reducedEnergy < distanceNum) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", counter, reducedEnergy);
                break;
            }
            reducedEnergy -= distanceNum;
            counter++;
            if (counter % 3 == 0) {
                reducedEnergy += counter;
            }

            command = scanner.nextLine();
        }
        if (command.equals("End of battle")) {

            System.out.printf("Won battles: %d. Energy left: %d", counter, reducedEnergy);

        }


    }
}
