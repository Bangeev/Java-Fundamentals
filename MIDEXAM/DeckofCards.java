package MIDEXAM;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeckofCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> cardsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            List<String> command = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

            if (command.get(0).equals("Add")){
                if (!cardsList.contains(command.get(1))){
                    cardsList.add(command.get(1));
                    System.out.println("Card successfully added");
                }
                else{
                    System.out.println("Card is already in the deck");
                }

            }else if (command.get(0).equals("Remove")){
                if (cardsList.contains(command.get(1))){
                    cardsList.remove(command.get(1));
                    System.out.println("Card successfully removed");
                }else {
                    System.out.println("Card not found");
                }
            }else if (command.get(0).equals("Remove At")){
                if (Integer.parseInt(command.get(1)) >= 0 && Integer.parseInt(command.get(1)) < cardsList.size()){
                    cardsList.remove(Integer.parseInt(command.get(1)));
                    System.out.println("Card successfully removed");
                }else {
                    System.out.println("Index out of range");
                }
            }else if (command.get(0).equals("Insert")){
                if (cardsList.contains(command.get(2)) && Integer.parseInt(command.get(1)) >=0 && Integer.parseInt(command.get(1)) < cardsList.size()) {
                    System.out.println("Card is already added");
                }else if (!(Integer.parseInt(command.get(1)) >=0 && Integer.parseInt(command.get(1)) < cardsList.size())) {
                    System.out.println("Index out of range");
                }else {
                    cardsList.add(Integer.parseInt(command.get(1)), command.get(2));
                    System.out.println("Card successfully added");
                }
            }



        }
        System.out.println(String.join(", ", cardsList));




    }
}
