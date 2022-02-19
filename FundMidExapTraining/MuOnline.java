package FundMidExapTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> dungeonRooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        int currentHealth = 100;
        int bitcoins = 0;
        int roomCount = 0;
        boolean notDead = true;

        for (int i = 0; i < dungeonRooms.size(); i++) {
            roomCount++;

            List<String> placeHolder = List.of(dungeonRooms.get(i).split(" "));

            if (placeHolder.get(0).contains("potion")) {

                int health = currentHealth;
                currentHealth += Integer.parseInt(placeHolder.get(1));

                if (currentHealth > 100) {
                    System.out.printf("You healed for %s hp.%n", 100 - health);
                    currentHealth = 100;

                } else {
                    System.out.printf("You healed for %s hp.%n", Integer.parseInt(placeHolder.get(1)));
                }
                System.out.printf("Current health: %d hp.%n", currentHealth);

            } else if (placeHolder.get(0).contains("chest")) {

                bitcoins += Integer.parseInt(placeHolder.get(1));

                System.out.printf("You found %s bitcoins.%n", placeHolder.get(1));

            } else {
                currentHealth -= Integer.parseInt(placeHolder.get(1));
                if (currentHealth <= 0) {
                    System.out.printf("You died! Killed by %s.%n", placeHolder.get(0));
                    System.out.printf("Best room: %d", roomCount);
                    notDead = false;
                    break;


                } else {
                    System.out.printf("You slayed %s.%n", placeHolder.get(0));

                }
            }


        }
        if (notDead) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", currentHealth);
        }


    }
}
