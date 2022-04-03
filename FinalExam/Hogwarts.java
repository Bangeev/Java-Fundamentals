package FinalExam;

import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String commands = scanner.nextLine();

        while (!commands.equals("Abracadabra")){
            String[] tokens = commands.split("\\s+");
            String command = tokens[0];

            if (command.equals("Abjuration")){
                String toUpperCase = input.toUpperCase();
                System.out.println(toUpperCase);
                input = toUpperCase;
            }else if (command.equals("Necromancy")){
                String toLowerCase = input.toLowerCase();
                System.out.println(toLowerCase);
                input = toLowerCase;
            }else if (command.equals("Illusion")){
                String let = tokens[2];
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < input.length()){
                    String partOneIs = input.substring(0, index);
                    String partTwoIs = input.substring(index + 1);
                    String myWord = partOneIs + let + partTwoIs;
                    input = myWord;
                    System.out.println("Done!");
                }else {
                    System.out.println("The spell was too weak.");
                }

            }else if (command.equals("Divination")){
                String first = tokens[1];
                String second = tokens[2];
                String replaceThem = input.replace(first, second);
                if (!replaceThem.equals(input)){
                    input = replaceThem;
                    System.out.println(input);
                }
            }else if (command.equals("Alteration")){
                String subString = tokens[1];
                String replaceSubStr = input.replace(subString, "");
                if (!replaceSubStr.equals(input)){
                    input = replaceSubStr;
                    System.out.println(input);
                }
            }else {
                System.out.println("The spell did not work!");
            }

            commands = scanner.nextLine();
        }

    }

}
