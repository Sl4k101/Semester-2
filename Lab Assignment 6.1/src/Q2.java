import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public void run() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        sort(list);

        System.out.println("Sorted numbers: " + list);
    }

    public void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // swap list[j] and list[j+1]
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}