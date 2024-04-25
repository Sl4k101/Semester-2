import java.util.ArrayList;
import java.util.Scanner;

class MultiplicationQuiz implements Calculatable {
    int num1, num2;
    ArrayList<Integer> answers = new ArrayList<>();

    public MultiplicationQuiz(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getResult() {
        return num1 * num2;
    }

    public void startQuiz() {
        Scanner input = new Scanner(System.in);
        int answer;
        do {
            System.out.println("What is " + num1 + " * " + num2 + "?");
            answer = input.nextInt();
            if (answers.contains(answer)) {
                System.out.println("You already entered " + answer);
                continue;
            }
            answers.add(answer);
            if (answer != getResult()) {
                System.out.println("Wrong answer. Try again.");
            }
        } while (answer != getResult());
        System.out.println("You got it!");
    }
}