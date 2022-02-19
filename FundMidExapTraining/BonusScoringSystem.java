package FundMidExapTraining;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int studentCount = Integer.parseInt(scanner.nextLine());

        int numOfLectures = Integer.parseInt(scanner.nextLine());

        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int bestAttendances = 0;


        for (int i = 0; i < studentCount; i++) {

            int attendances = Integer.parseInt(scanner.nextLine());

            double totalBonus = attendances * 1.0 / numOfLectures * (5 + additionalBonus);

            while (maxBonus < totalBonus) {
                maxBonus = totalBonus;
                bestAttendances = attendances;
            }


        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", bestAttendances);


    }
}
