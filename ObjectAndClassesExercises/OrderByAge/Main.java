package ObjectAndClassesExercises.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<People> myPeopleList = new ArrayList<>();

        while (!input.equals("End")){

            String name = input.split(" ")[0];
            String id = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);

            People people = new People(name, id, age);

            myPeopleList.add(people);




            input = scanner.nextLine();
        }

        myPeopleList.sort(Comparator.comparing(People::getAge));

        for (People people : myPeopleList){
            System.out.printf("%s with ID: %s is %d years old.%n",people.getName(), people.getId(), people.getAge());
        }


    }
}
