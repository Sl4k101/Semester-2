public class GeometricDriver {
    public static void Q5() {
        GeometricObject[] objects = {
            new Circle(5), // Circle 1
            new Circle(10), // Circle 2
            new Rectangle(5, 10), // Rectangle 1
            new Rectangle(10, 20), // Rectangle 2
            new Triangle(5, 10), // Triangle 1
            new Triangle(10, 20) // Triangle 2
        };

        double totalArea = sumArea(objects);
        String formattedArea = String.format("%.2f", totalArea);
        System.out.println("Total area: " + formattedArea);
    }

    public static double sumArea(GeometricObject[] a) {
        double totalArea = 0;
        for (GeometricObject obj : a) {
            if (obj instanceof Summable) {
                totalArea += ((Summable) obj).sumArea();
            }
        }
        return totalArea;
    }
}