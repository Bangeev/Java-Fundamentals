package FundMidExapTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        while (!command.get(1).equals("Shopping!")) {

            switch (command.get(0)) {
                case "Urgent":

                    if (shoppingList.contains(command.get(1))){
                        break;
                    }else {
                        shoppingList.add(0, command.get(1));
                    }

                    break;

                case "Unnecessary":

                    if (shoppingList.contains(command.get(1))){
                        shoppingList.remove(command.get(1));
                    }else {
                        break;
                    }

                    break;

                case "Correct":

                    if (shoppingList.contains(command.get(1))){
                        shoppingList.set(shoppingList.indexOf(command.get(1)), command.get(2));
                    }else {
                        break;
                    }

                    break;

                case "Rearrange":

                    if (shoppingList.contains(command.get(1))){
                        shoppingList.remove(command.get(1));
                        shoppingList.add(command.get(1));
                    }else {
                        break;
                    }

                    break;
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        System.out.println(String.join(", ", shoppingList));


    }
}
