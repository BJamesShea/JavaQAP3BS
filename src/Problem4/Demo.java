package Problem4;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle("Circle 1", 5.0),
                new Ellipse("Ellipse 1", 6.0, 4.0),
                new Triangle("Triangle 1", 3.0, 4.0, 5.0),
                new EquilateralTriangle("Equilateral Triangle 1", 6.0)
        };

        System.out.println("Shapes before scaling:");
        System.out.println();
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println();
        System.out.println("Scaling shapes by factor of 2!");
        System.out.println();
        for (Shape shape : shapes) {
            shape.scale(2.0);
        }

        System.out.println("Shapes after scaling:");
        System.out.println();
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
