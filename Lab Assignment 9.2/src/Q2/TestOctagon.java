package Q2;
public class TestOctagon {
    public static void main(String[] args) {
        Octagon octagon1 = new Octagon(5);
        System.out.println("--- Octagon1 ---\nArea: " + octagon1.getArea() + "\nPerimeter: " + octagon1.getPerimeter());

        Octagon octagon2 = (Octagon) octagon1.clone();
        System.out.println("\n--- Octagon2 ---\nArea: " + octagon2.getArea() + "\nPerimeter: " + octagon2.getPerimeter());

        if (octagon1.compareTo(octagon2) == 0) {
            System.out.println("\nBoth octagons are equal");
        }
    }
}