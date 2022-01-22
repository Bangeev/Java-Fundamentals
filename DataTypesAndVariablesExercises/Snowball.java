package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class Snowball {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double snowBallValue = 0;
        double maxDouble = Double.MIN_VALUE;
        int snowBallSnowBest = 0;
        int snowBallTImeBest = 0;
        int snowBallQualityBest = 0;
        for (int balls = 1; balls <= n ; balls++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());


            snowBallValue = Math.pow(((snowBallSnow * 1.0) / snowBallTime) , snowBallQuality);
            if (snowBallValue > maxDouble){
                maxDouble = snowBallValue;
                snowBallSnowBest = snowBallSnow;
                snowBallTImeBest = snowBallTime;
                snowBallQualityBest = snowBallQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)", snowBallSnowBest, snowBallTImeBest, maxDouble, snowBallQualityBest);





    }
}
