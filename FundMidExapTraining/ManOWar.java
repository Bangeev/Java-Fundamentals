package FundMidExapTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        boolean isOver = false;

        while (!input.equals("Retire")) {
            String command = input.split(" ")[0];

            if (command.equals("Fire")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int damage = Integer.parseInt(input.split(" ")[2]);
                isOver =  fire(index, damage, warShip);
                if (isOver) {
                    return;
                }
            } else if (command.equals("Defend")) {
                int startIndex = Integer.parseInt(input.split(" ")[1]);
                int endIndex = Integer.parseInt(input.split(" ")[2]);
                int damage = Integer.parseInt(input.split(" ")[3]);
                isOver =  defend(startIndex, endIndex, damage, pirateShip);
                if (isOver) {
                    return;
                }
            } else if (command.equals("Repair")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int health = Integer.parseInt(input.split(" ")[2]);
                repair(index, health, maxHealth, pirateShip);
            } else if (command.equals("Status")) {
                status(maxHealth, pirateShip);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Pirate ship status: %d%n", sum(pirateShip));
        System.out.printf("Warship status: %d%n", sum(warShip));
    }
    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static void status(int maxHealth, List<Integer> list) {
        int counter = 0;
        double maxH = maxHealth * 0.2;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < maxH) {
                counter++;
            }
        }
        System.out.printf("%d sections need repair.%n", counter);
    }

    public static boolean defend(int startIndex, int endIndex, int damage, List<Integer> list) {
        if (startIndex >= 0 && endIndex < list.size()) {
            for (int i = startIndex; i <= endIndex; i++) {
                int temp = list.get(i) - damage;
                if (temp > 0) {
                    list.set(i, temp);
                } else {
                    System.out.println("You lost! The pirate ship has sunken.");
                    // Runtime.getRuntime().halt(0);
                    //  System.exit(0);
                    return true;
                }
            }
        }
        return false;
    }

    public static void repair(int index, int health, int maxHealth, List<Integer> list) {
        if (index >= 0 && index < list.size()) {
            int temp = list.get(index) + health;
            if (temp > maxHealth) {
                temp = maxHealth;
            }
            list.set(index, temp);
        }
    }

    public static boolean fire(int index, int damage, List<Integer> list) {
        if (index >= 0 && index < list.size()) {
            int temp = list.get(index) - damage;
            if (temp > 0) {
                list.set(index, temp);
            } else {
                System.out.println("You won! The enemy ship has sunken.");
                //System.exit(0);
                // Runtime.getRuntime().halt(0);
                return true;
            }
        }
        return false;

    }
}

