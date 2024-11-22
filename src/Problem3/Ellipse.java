package Problem3;

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

    public void setMajorAxis(double majorAxis) {
        if (majorAxis >= this.minorAxis) {
            this.majorAxis = majorAxis;
        } else {
            throw new IllegalArgumentException("Major axis must be greater than or equal to minor axis.");
        }
    }

    public void setMinorAxis(double minorAxis) {
        if (minorAxis <= this.majorAxis) {
            this.minorAxis = minorAxis;
        } else {
            throw new IllegalArgumentException("Minor axis must be less than or equal to major axis.");
        }
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
    public String toString() {
        return super.toString() + ", Major Axis: " + majorAxis + ", Minor Axis: " + minorAxis +
                ", Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
}
