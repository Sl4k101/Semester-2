    import java.util.Scanner;

    public class Fibonachi {
        public static void Fibonachi() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of terms you want to generate: ");
            int n = scanner.nextInt();
    
            System.out.println("Enter the Type of method you want to use: ");
            System.out.println("1. Recursive TriFibonacci sequence\n2. Iterative TriFibonacci sequence");
           
            int method = scanner.nextInt();

            if (method == 1) {
                System.out.println("Recursive TriFibonacci sequence: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(recursiveTriFibonacci(i) + " ");
                }
            } else if (method == 2) {
                System.out.println("Iterative TriFibonacci sequence: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(iterativeTriFibonacci(i) + " ");
                }
            } else {
                System.out.println("Invalid input");
            }
        }
        public static int recursiveTriFibonacci(int n) {
            if (n < 3) {
                return n;
            } else {
                return recursiveTriFibonacci(n - 1) + recursiveTriFibonacci(n - 2) + recursiveTriFibonacci(n - 3);
            }
        }
        public static int iterativeTriFibonacci(int n) {
            if (n < 3) {
                return n;
            }
        
            int a = 0, b = 1, c = 2, d = a + b + c;
        
            for (int i = 3; i < n; i++) {
                a = b;
                b = c;
                c = d;
                d = a + b + c;
            }
        
            return d;
        }
    }