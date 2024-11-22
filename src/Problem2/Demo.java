package Problem2;

public class Demo {
    public static void main(String[] args) {

        Point p1 = new Point(2.5f, 3.8f);
        System.out.println("Point: " + p1);

        p1.setXY(5.0f, 6.0f);
        System.out.println("Updated Point: " + p1);


        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("MovablePoint: " + mp1);

        mp1.move();
        System.out.println("After Move: " + mp1);

        mp1.setSpeed(1.0f, 2.0f);
        mp1.move();
        System.out.println("After Updating Speed and Move: " + mp1);
    }
}
