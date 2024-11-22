package Problem3;

public class Demo {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[] {
                new Circle("Circle 1", 5.0),
                new Ellipse("Ellipse 1", 6.0, 4.0),
                new Triangle("Triangle 1", 3.0, 4.0, 5.0),
                new EquilateralTriangle("Equilateral Triangle 1", 6.0)
        };


        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
