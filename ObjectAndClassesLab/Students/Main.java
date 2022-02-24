package ObjectAndClassesLab.Students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> studentsList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        List<Student> myStudents = new ArrayList<>();

        while (!studentsList.get(0).equals("end")) {

            String firstName = studentsList.get(0);
            String lastName = studentsList.get(1);
            int age = Integer.parseInt(studentsList.get(2));
            String homeTown = studentsList.get(3);

            Student student = new Student();

            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setHomeTown(homeTown);

            myStudents.add(student);


            studentsList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        String command = scanner.nextLine();

        for (Student student : myStudents){
            if (student.getHomeTown().equals(command)){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }
}
