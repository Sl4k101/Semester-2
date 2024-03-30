import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Q3 {
    public static void runQ3() {
        String filename = "Q3.txt";
        writeAnimalsToFile(filename);
        ArrayList<String> animals = readAnimalsFromFile(filename);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the name of an animal:");
            String inputAnimal = scanner.nextLine();

            if (animals.contains(inputAnimal)) {
                System.out.println("Success: The animal is in the list.");
            } else {
                System.out.println("The animal was not found in the list. Adding it now.");
                animals.add(inputAnimal);
                writeArrayListToFile(animals, filename);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeAnimalsToFile(String filename) {
        try (java.io.PrintWriter output = new java.io.PrintWriter(filename)) {
            String[] animalNames = {"Lion", "Tiger", "Bear", "Elephant", "Giraffe", "Zebra", "Kangaroo", "Panda", "Wolf", "Fox"};
            for (String animalName : animalNames) {
                output.println(animalName);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static ArrayList<String> readAnimalsFromFile(String filename) {
        ArrayList<String> animals = new ArrayList<>();
        try (Scanner input = new Scanner(new java.io.File(filename))) {
            while (input.hasNextLine()) {
                animals.add(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return animals;
    }

    private static void writeArrayListToFile(ArrayList<String> list, String filename) {
        try (java.io.PrintWriter output = new java.io.PrintWriter(filename)) {
            for (String item : list) {
                output.println(item);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
