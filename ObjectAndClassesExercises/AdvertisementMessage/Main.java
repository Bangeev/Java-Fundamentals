package ObjectAndClassesExercises.AdvertisementMessage;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfAdvertisements = Integer.parseInt(scanner.nextLine());
        String[] phrases = { "Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product." };
        String[] events = { "Now I feel good.", "I have succeeded with this product.", "Makes miracles.I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!" };
        String[] authors = { "Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva" };
       String[] cities = { "Burgas", "Sofia", "Plovdiv", "Varna", "Ruse" };
        Random rand = new Random();

        for(int i=0; i<countOfAdvertisements; i++)
        {
            String phrase = phrases[rand.nextInt(1, phrases.length)];
            String event = events[rand.nextInt(1, events.length)];
           String author = authors[rand.nextInt(1, authors.length)];
            String city = cities[rand.nextInt(1, cities.length)];

            System.out.printf("%s %s %s - %s%n", phrase, event, author, city);
        }
    }
}
