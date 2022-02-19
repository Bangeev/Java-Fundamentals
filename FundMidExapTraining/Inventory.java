package FundMidExapTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        while (!command.get(0).equals("Craft!")){

            switch (command.get(0)){
                case "Collect" :
                    if (!items.contains(command.get(2))){
                        items.add(command.get(2));
                    }
                    break;
                case "Drop" :
                    items.remove(command.get(2));
                    break;
                case "Combine" :
                    List<String> placeHolder = List.of(command.get(3).split(":"));
                    if (items.contains(placeHolder.get(0))){
                       int index = items.indexOf(placeHolder.get(0));
                       items.add(index + 1, placeHolder.get(1));
                    }
                    break;
                case "Renew" :
                    if (items.contains(command.get(2))){

                        items.remove(command.get(2));
                        items.add(command.get(2));

                    }
                    break;
            }


            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        System.out.println(String.join(", ", items));



    }
}
