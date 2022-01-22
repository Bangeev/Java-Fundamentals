package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int waterTank = 255;
        int capacity = 0;
        int myTankIsFull = 0;


        for (int i = 1; i <= n; i++) {
            int litersOfWater = Integer.parseInt(scanner.nextLine());
            capacity += litersOfWater;
            if (capacity > waterTank){
                System.out.println("Insufficient capacity!");
                capacity -= litersOfWater;
            }



        }
        System.out.println(capacity);







    }
}
