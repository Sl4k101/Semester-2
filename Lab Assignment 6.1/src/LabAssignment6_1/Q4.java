package LabAssignment6_1;
import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static ArrayList<Character> toCharacterArray(String string) {
        ArrayList<Character> array = new ArrayList<>();
        for(int i = 0; i < string.length(); i++) {
            array.add(string.charAt(i));
        }
        return array;
    }

    public static void runQ4() {
        Scanner input = new Scanner(System.in);
        // Get string from user
        System.out.println("Enter a string to convert to a Character array: ");
        ArrayList<Character> array = Q4.toCharacterArray(input.next());
        // Display the string as separate characters from array
        for(int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }
}