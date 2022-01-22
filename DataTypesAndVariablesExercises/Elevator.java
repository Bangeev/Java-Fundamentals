package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());

        double moveElevator = Math.ceil((double) persons /elevatorCapacity);

        System.out.printf("%.0f", moveElevator);

    }
}
