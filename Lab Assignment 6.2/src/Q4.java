import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("Enter five integers for list1: ");
        list1 = readFiveIntegers(scanner);

        System.out.println("Enter five integers for list2: ");
        list2 = readFiveIntegers(scanner);

        ArrayList<Integer> combinedList = union(list1, list2);
        System.out.println("The combined list is " + combinedList);
    }

    public static ArrayList<Integer> readFiveIntegers(Scanner scanner) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while (count < 5) {
            try {
                list.add(scanner.nextInt());
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // consume the invalid input
            }
        }
        return list;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> unionList = new ArrayList<>(list1);
        unionList.addAll(list2);
        return unionList;
    }
}