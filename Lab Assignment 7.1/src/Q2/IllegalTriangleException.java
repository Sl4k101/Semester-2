package Q2;

public class IllegalTriangleException extends Exception {
    public String getMessage() {
        return "The sum of any two sides must be greater than the other side.";
    }
}