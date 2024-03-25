import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        // Fill the matrix with 0s and 1s
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // Find the rows and columns with the most 1s
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> columns = new ArrayList<>();
        int maxRow = 0;
        int maxColumn = 0;

        for (int i = 0; i < n; i++) {
            int rowCount = 0;
            int columnCount = 0;
            for (int j = 0; j < n; j++) {
                rowCount += matrix[i][j];
                columnCount += matrix[j][i];
            }
            if (rowCount > maxRow) {
                maxRow = rowCount;
                rows.clear();
                rows.add(i);
            } else if (rowCount == maxRow) {
                rows.add(i);
            }

            if (columnCount > maxColumn) {
                maxColumn = columnCount;
                columns.clear();
                columns.add(i);
            } else if (columnCount == maxColumn) {
                columns.add(i);
            }
        }

        System.out.println("The largest row index: " + rows);
        System.out.println("The largest column index: " + columns);
    }
}