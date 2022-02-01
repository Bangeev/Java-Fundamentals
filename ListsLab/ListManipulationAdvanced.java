package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<String> command = List.of(scanner.nextLine().split(" "));
        while (!command.get(0).equals("end")) {


            switch (command.get(0)) {
                case "Contains":

                    if (numsList.contains(Integer.parseInt(command.get(1)))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":

                    if (command.get(1).equals("even")) {
                        for (int i = 0; i < numsList.size(); i++) {

                            if (numsList.get(i) % 2 == 0) {
                                System.out.print(numsList.get(i) + " ");
                            }
                        }


                    } else if (command.get(1).equals("odd")) {

                        for (int i = 0; i < numsList.size(); i++) {


                            if (numsList.get(i) % 2 != 0) {
                                System.out.print(numsList.get(i) + " ");
                            }
                        }

                    }
                    System.out.println();

                    break;
                case "Get":

                    if (command.get(1).equals("sum")) {
                        int sum = 0;
                        for (int element : numsList) {

                            sum += element;

                        }
                        System.out.println(sum);
                    }

                    break;
                case "Filter":

                    if (command.get(1).equals("<")) {
                        for (int i = 0; i < numsList.size(); i++) {
                            if (numsList.get(i) < Integer.parseInt(command.get(2))) {
                                System.out.print(numsList.get(i) + " ");
                            }


                        }

                    } else if (command.get(1).equals(">")) {
                        for (int i = 0; i < numsList.size(); i++) {
                            if (numsList.get(i) > Integer.parseInt(command.get(2))) {
                                System.out.print(numsList.get(i) + " ");
                            }
                        }
                    } else if (command.get(1).equals(">=")) {
                        for (int i = 0; i < numsList.size(); i++) {
                            if (numsList.get(i) >= Integer.parseInt(command.get(2))) {
                                System.out.print(numsList.get(i) + " ");
                            }
                        }
                    } else if (command.get(1).equals("<=")) {
                        for (int i = 0; i < numsList.size(); i++) {
                            if (numsList.get(i) <= Integer.parseInt(command.get(2))) {
                                System.out.print(numsList.get(i) + " ");
                            }


                        }
                    }
                    System.out.println();
                    break;

            }
            command = List.of(scanner.nextLine().split(" "));
        }


    }
}
