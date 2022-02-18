package FundMidExapTraining;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double quantityOfFood = Double.parseDouble(scanner.nextLine());
        double hay = Double.parseDouble(scanner.nextLine());
        double cover = Double.parseDouble(scanner.nextLine());

        double pigWeight = Double.parseDouble(scanner.nextLine());

        quantityOfFood *= 1000;
        hay *= 1000;
        cover *= 1000;
        pigWeight *= 1000;

         double hayInProcent = 0.0;

        for (int i = 1; i <= 30; i++) {

            quantityOfFood -= 300;
            if (i % 2 == 0){
                hayInProcent = quantityOfFood * 0.05;
                hay -= hayInProcent;
            }
            if (i % 3 == 0){
                cover = (cover - (pigWeight / 3));
            }
            if (quantityOfFood <= 0 || hay <= 0 || cover <= 0){
                System.out.println("Merry must go to the pet store!");
                break;
            }


        }
        if (quantityOfFood > 0 && hay > 0 && cover > 0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", quantityOfFood / 1000, hay / 1000, cover / 1000);
        }



    }
}
