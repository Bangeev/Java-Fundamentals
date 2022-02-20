package MIDEXAM;


import java.nio.charset.StandardCharsets;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.List;
    import java.util.Scanner;
    import java.util.stream.Collectors;

public class CoffeLowerx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeeList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            List<String> commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

            String command = commandList.get(0);

            switch (command) {
                case "Include":
                    coffeeList.add(commandList.get(1));
                    break;

                case "Remove":
                    String firstOrLast = commandList.get(1);
                    int numberOfCoffees = Integer.parseInt(commandList.get(2));
                    int size = coffeeList.size() - numberOfCoffees;
                    if (numberOfCoffees <= coffeeList.size()) {
                        switch (firstOrLast) {
                            case "first":
                                while(coffeeList.size() > size){
                                    coffeeList.remove(0);
                                }


                                break;

                            case "last":
                                while(coffeeList.size() > size){
                                    coffeeList.remove(coffeeList.size()-1);
                                }
                                break;
                        }

                    }
                    break;

                case "Prefer":
                    int firstIndex = Integer.parseInt(commandList.get(1));
                    int secondIndex = Integer.parseInt(commandList.get(2));

                    if (firstIndex >= 0 && firstIndex < coffeeList.size() && secondIndex >= 0 && secondIndex < coffeeList.size()) {
                        String coffeeFirst = coffeeList.get(firstIndex);
                        String coffeeSecond = coffeeList.get(secondIndex);

                        coffeeList.set(firstIndex, coffeeSecond);
                        coffeeList.set(secondIndex, coffeeFirst);
                        break;
                    }

                    break;

                case "Reverse":
                    Collections.reverse(coffeeList);
                    break;

            }
        }

        System.out.println("Coffees:");
        System.out.println(String.join(" ", coffeeList));


    }
}