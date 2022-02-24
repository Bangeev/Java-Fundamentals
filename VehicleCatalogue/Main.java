package ObjectAndClassesExercises.VehicleCatalogue;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Vehicle> myCarsVehicles = new ArrayList<>();
        List<Vehicle> myTrucksVehicles = new ArrayList<>();
        List<Vehicle> myVehicles = new ArrayList<>();
        DecimalFormat decimalFormat = new DecimalFormat("0.##");


        double carsHorsePower = 0.0;
        double trucksHorsePower = 0.0;
        while (!line.equals("End")) {
            String typee = line.split(" ")[0];
            String type = typee.substring(0,1).toUpperCase() + typee.substring(1);
            String model = line.split(" ")[1];
            String color = line.split(" ")[2];
            double horsePower = Double.parseDouble(line.split(" ")[3]);


            Vehicle vehicle = new Vehicle(type, model, color, horsePower);

            if (vehicle.getType().equals("Car")) {

                myCarsVehicles.add(vehicle);
                carsHorsePower += vehicle.getHorsePower();

            } else {

                myTrucksVehicles.add(vehicle);
                trucksHorsePower += vehicle.getHorsePower();

            }
            myVehicles.add(vehicle);

            line = scanner.nextLine();
        }

        String command = scanner.nextLine();

        while (!command.equals("Close the Catalogue")) {
            for (Vehicle vehicle : myVehicles) {
                if (command.equals(vehicle.getModel())) {
                    System.out.printf("Type: %s%n", vehicle.getType());
                    System.out.printf("Model: %s%n", vehicle.getModel());
                    System.out.printf("Color: %s%n", vehicle.getColor());
                    String df = decimalFormat.format(vehicle.getHorsePower());
                    System.out.printf("Horsepower: %s%n",df);

                }
            }


            command = scanner.nextLine();
        }
        carsHorsePower =  carsHorsePower / myCarsVehicles.size();

        trucksHorsePower = trucksHorsePower / myTrucksVehicles.size();

        if (carsHorsePower > 0){
            System.out.printf("Cars have average horsepower of: %.2f.%n", carsHorsePower);
        }else
        {
            System.out.println("Cars have average horsepower of: 0.00.");
        }
        if (trucksHorsePower > 0){
            System.out.printf("Trucks have average horsepower of: %.2f.", trucksHorsePower);
        }else {
            System.out.println("Trucks have average horsepower of: 0.00.");
        }








    }
}
