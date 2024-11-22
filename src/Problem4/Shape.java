package Problem4;

public abstract class Shape implements Scalable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double computeArea();
    public abstract double computePerimeter();

    @Override
    public String toString() {
        return "Shape: " + name;
    }
}
