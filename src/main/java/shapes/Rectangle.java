package shapes;

public class Rectangle {
    private double length;
    private double breadth;

    Rectangle() {
        this(1, 1);
    }

    Rectangle(double length, double breadth) {
        setLength(length);
        setBreadth(breadth);
    }

    public double area() {
        return length * breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) throw new IllegalArgumentException("length should be greater than 0");
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        if (breadth <= 0) throw new IllegalArgumentException("breadth should be greater than 0");
        this.breadth = breadth;
    }

    public double perimeter() {
        return 2*(this.length + this.breadth);
    }
}
