package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double volume = 0;
        double maxDouble = Double.MIN_VALUE;
        String theBiggestKeg = "";



        for (int i = 1; i <= n; i++) {

            String model = scanner.nextLine();
            double radios = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());


            volume = Math.PI * Math.pow(radios, 2) * height;

            if (volume > maxDouble){
                maxDouble = volume;
                theBiggestKeg = model;

            }
        }
        System.out.println(theBiggestKeg);
    }
}
