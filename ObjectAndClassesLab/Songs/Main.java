package ObjectAndClassesLab.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        List<Song> songsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("_");

            String typeList = data[0];
            String name = data[1];
            String time = data[2];

            Song currentSong = new Song();

            currentSong.setTypeList(typeList);
            currentSong.setName(name);
            currentSong.setTime(time);

            songsList.add(currentSong);


        }
        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song song : songsList) {
                System.out.println(song.getName());
            }
        }else {
            for (Song song : songsList){
                if (song.getTypeList().equals(command))
                System.out.println(song.getName());
            }
        }
    }
}
