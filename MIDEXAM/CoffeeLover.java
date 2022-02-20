package MIDEXAM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> coffeeList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
           List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            if (command.get(0).equals("Include")) {
                coffeeList.add(command.get(1));
            } else if (command.get(0).equals("Remove") && command.get(1).equals("first")) {
                for (int j = 0; j < Integer.parseInt(command.get(2)); j++) {
                    coffeeList.remove(0);
                }

            } else if (command.get(0).equals("Remove") && command.get(1).equals("last")) {
                for (int j = coffeeList.size() - Integer.parseInt(command.get(2)); j < coffeeList.size(); j++) {
                    coffeeList.remove(coffeeList.size() - Integer.parseInt(command.get(2)));
                }
            } else if (command.get(0).equals("Prefer")) {
                if (Integer.parseInt(command.get(1)) < coffeeList.size() && Integer.parseInt(command.get(1)) >= 0 && Integer.parseInt(command.get(2)) < coffeeList.size() && Integer.parseInt(command.get(2)) >= 0) {

                    String holder = coffeeList.get(Integer.parseInt(command.get(1)));
                    String holdertwo = coffeeList.get(Integer.parseInt(command.get(2)));
                    coffeeList.set(Integer.parseInt(command.get(1)), holdertwo);
                    coffeeList.set(Integer.parseInt(command.get(2)), holder);




                }
            }else if (command.get(0).equals("Reverse")){
                Collections.reverse(coffeeList);
            }



        }


        System.out.println("Coffees:");
        System.out.println(String.join(" ", coffeeList));
    }
}
