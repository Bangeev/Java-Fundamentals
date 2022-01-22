package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int pokePower = Integer.parseInt(scanner.nextLine());
        int distanceBetweenTargets = Integer.parseInt(scanner.nextLine());
        int exhFactor = Integer.parseInt(scanner.nextLine());
        int targetsCount = 0;
        int pokePowerValue = pokePower;

        while (pokePower >= distanceBetweenTargets){
            pokePower -= distanceBetweenTargets;
            targetsCount++;

                if (exhFactor != 0 && (pokePowerValue * 0.5) == pokePower){
                    pokePower /= exhFactor;


        }

        }
        System.out.printf("%d%n%d", pokePower, targetsCount);
    }
}
