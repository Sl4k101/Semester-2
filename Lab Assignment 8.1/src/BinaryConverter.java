import java.util.Scanner;

public class BinaryConverter {

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int decimal = 0;
        for (char c : binaryString.toCharArray()) {
            if (c != '0' && c != '1') {
                throw new BinaryFormatException("Not a binary number: " + binaryString);
            }
            decimal = decimal * 2 + (c - '0');
        }
        return decimal;
    }

    public static void Q1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binaryString = scanner.nextLine();

        try {
            int decimal = bin2Dec(binaryString);
            System.out.println("The decimal equivalent of binary " + binaryString + " is: " + decimal);
        } catch (BinaryFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}