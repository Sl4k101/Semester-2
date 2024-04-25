class Circle extends GeometricObject implements Summable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double sumArea() {
        return getArea();
    }
}
