package BasicSyntaxConditionalStatementsandLoopsMoreExercises;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        On the first line, you will receive your current balance – a floating-point number in the range [0.00…5000.00].

        Double currenBalance = Double.parseDouble(scanner.nextLine());

        String gameTime = "Game Time";
        String input = scanner.nextLine();
        double gamePrice = 0;
        double expenses = 0;

        while (!input.equals(gameTime)){
            switch (input){
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    if (currenBalance >= 39.99){
                        System.out.printf("Bought %s%n", input);
                        currenBalance -= gamePrice;
                        expenses += gamePrice;
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                    case "CS: OG":
                    gamePrice = 15.99;
                    if (currenBalance >= 15.99){
                        System.out.printf("Bought %s%n", input);
                        currenBalance -= gamePrice;
                        expenses += gamePrice;
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                    case "Zplinter Zell":
                    gamePrice = 19.99;
                    if (currenBalance >= 19.99){
                        System.out.printf("Bought %s%n", input);
                        currenBalance -= gamePrice;
                        expenses += gamePrice;
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                    case "Honored 2":
                    gamePrice = 59.99;
                    if (currenBalance >= 59.99){
                        System.out.printf("Bought %s%n", input);
                        currenBalance -= gamePrice;
                        expenses += gamePrice;
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                    case "RoverWatch":
                    gamePrice = 29.99;
                    if (currenBalance >= 29.99){
                        System.out.printf("Bought %s%n", input);
                        currenBalance -= gamePrice;
                        expenses += gamePrice;
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;

                default:
                    System.out.println("Not Found");
            }
            if (currenBalance == 0){
                System.out.println("Out of mo-ney!");
                return;
            }
            input = scanner.nextLine();




        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", expenses, currenBalance);





    }
}
