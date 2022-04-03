package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInputs = Integer.parseInt(scanner.nextLine());


        while (numInputs > 0) {
            String input = scanner.nextLine();
            String regex = "(\\|)(?<bossName>[A-Z]{4,})\\1:(#)(?<title>[A-Z][a-z]+ [A-z]+)\\3";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String boss = matcher.group("bossName");
                String title = matcher.group("title");
                System.out.printf("%s, The %s%n", boss, title);
                System.out.printf(">> Strength: %d%n", boss.length());
                System.out.printf(">> Armor: %s%n", title.length());
            } else {
                System.out.println("Access denied!");
            }
            numInputs--;
        }


    }
}
