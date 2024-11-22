package Problem4;

public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        if (majorAxis >= minorAxis) {
            this.majorAxis = majorAxis;
            this.minorAxis = minorAxis;
        } else {
            this.majorAxis = minorAxis;
            this.minorAxis = majorAxis;
        }
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    @Override
    public double computeArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double computePerimeter() {
        return Math.PI * (3 * (majorAxis + minorAxis) - Math.sqrt((3 * majorAxis + minorAxis) * (majorAxis + 3 * minorAxis)));
    }

    @Override
    public void scale(double factor) {
        majorAxis *= factor;
        minorAxis *= factor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major Axis: " + majorAxis + ", Minor Axis: " + minorAxis +
                ", Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
}
