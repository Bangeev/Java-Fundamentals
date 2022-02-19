package FundMidExapTraining;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plunderDays = Integer.parseInt(scanner.nextLine());

        int dailyPlunder = Integer.parseInt(scanner.nextLine());

        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double allPlunders = 0;
        double halfPercents = 0;
        double oneThirdpercents = 0;

        for (int i = 1; i <= plunderDays; i++) {

            allPlunders += dailyPlunder;
            if (i % 3 == 0){
                halfPercents = dailyPlunder * 0.5;
                allPlunders += halfPercents;

            }
            if (i % 5 == 0){
                oneThirdpercents = allPlunders * 0.3;
                allPlunders -=oneThirdpercents;

            }


        }
        if (allPlunders >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", allPlunders);
        }else {
            System.out.printf("Collected only %.2f%% of the plunder.", (allPlunders / expectedPlunder * 100));
        }






    }
}
