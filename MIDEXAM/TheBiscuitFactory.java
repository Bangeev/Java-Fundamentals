package MIDEXAM;

import java.util.Scanner;

public class TheBiscuitFactory {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int numBiscuit = Integer.parseInt(scanner.nextLine());
            int countWorkers = Integer.parseInt(scanner.nextLine());
            int biscuitNumMonth = Integer.parseInt(scanner.nextLine());
            double myFactoryProduced = 0;
            double numBiscuitOnThird = 0;
            double myDiff = 0;
            for (int i = 1; i <= 30; i++) {

                if (i % 3 == 0) {
                    numBiscuitOnThird = numBiscuit * 0.75;
                    myFactoryProduced += numBiscuitOnThird;
                    if(numBiscuit==1){
                        myFactoryProduced=Math.floor(myFactoryProduced);
                    }
                } else
                    myFactoryProduced += numBiscuit;
                if(numBiscuit==1){
                    myFactoryProduced=Math.floor(myFactoryProduced);
                }
            }
            myFactoryProduced *= countWorkers;


            if (myFactoryProduced > biscuitNumMonth) {
                myDiff = myFactoryProduced - biscuitNumMonth;
                System.out.printf("You have produced %.0f biscuits for the past month.%n", myFactoryProduced);
                System.out.printf("You produce %.2f percent more biscuits.%n", (myDiff / biscuitNumMonth) * 100);
            } else {
                myDiff = biscuitNumMonth - myFactoryProduced;
                System.out.printf("You have produced %.0f biscuits for the past month.%n", myFactoryProduced);
                System.out.printf("You produce %.2f percent less biscuits.%n", (myDiff / biscuitNumMonth) * 100);
            }

        }
    }