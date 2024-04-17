package Q2;

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    public Octagon(double side) {
        super(side);
    }

    public double getArea() {
        return (2 + 4 * Math.sqrt(2)) * getSide() * getSide();
    }

    public double getPerimeter() {
        return 8 * getSide();
    }

    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea()) return 1;
        else if (getArea() < o.getArea()) return -1;
        else return 0;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}