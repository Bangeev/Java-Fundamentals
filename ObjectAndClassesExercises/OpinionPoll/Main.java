package ObjectAndClassesExercises.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> myList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name,age);

            myList.add(person);


        }

        myList.sort(Comparator.comparing(Person::getName));

       for (Person person : myList){
           if (person.getAge() > 30){
               System.out.println(person.getName() + " - " + person.getAge());
           }
       }


    }
}
