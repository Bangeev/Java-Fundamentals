package TextProcessingExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(", ");


        for (int i = 0; i < line.length; i++) {

            String element = line[i];


            if (element.length() >= 3 && element.length() <= 16){

                for (Character e : element.toCharArray()){
                    if (!Character.isLetterOrDigit(e) || Character.isDigit(e) || e.equals('-') || e.equals('_')){
                        break;
                    }else {
                        System.out.println(element);
                        break;
                    }
                }
            }
        }*/



        public static void main(String[] args) throws IOException {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

            String[] input = read.readLine().split(", ");

            Pattern check = Pattern.compile("^([A-Za-z\\d\\-_]{3,16})$");

            for (String element : input) {
                Matcher matcher = check.matcher(element);
                if (matcher.find()){
                    System.out.println(element);
                }
            }

    }
}
