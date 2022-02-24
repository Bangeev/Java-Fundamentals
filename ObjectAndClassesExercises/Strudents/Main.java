package ObjectAndClassesExercises.Strudents;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        List<Student> listOfStudents = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String firstName = input.split(" ")[0];
            String secondName = input.split(" ")[1];
            double grade = Double.parseDouble(input.split(" ")[2]);

            Student student = new Student(firstName, secondName, grade);

            listOfStudents.add(student);



        }
        listOfStudents.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : listOfStudents){
            System.out.printf("%s %s: %.2f%n",student.getFirstName(),student.getSecondName(),student.getGrade());
        }



    }
}
