/**
 * Name: William Lafleur
 * Date: February 8th, 2022
 * Description: Program to test creating objects of type MyPoint.
 *              MyPoint contains both instance methods and class methods.
 */


public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(2.0, 4.0);

        p1.SetX(4.3);
        p1.SetY(1.2);

        System.out.println(p2.toString());
        System.out.println(p1.toString());

        double distance = p2.EuclideanDistance(p1);

        System.out.println(distance);

        MyPoint[] p3 = new MyPoint[5];
        MyPoint p4 = new MyPoint(1.0, 6.1);
        p3[0] = new MyPoint(3.0, 6.1);
        p3[1] = new MyPoint(6.0, 1.2);
        p3[2] = new MyPoint(2.0, 4.5);
        p3[3] = new MyPoint(1.0, 6.1);
        p3[4] = new MyPoint(5.0, 9.0);

        System.out.println(MyPoint.Contains(p3, p4));

        MyPoint[] p5 = new MyPoint[5];
        p5[0] = new MyPoint(3.0, 1.1);
        p5[1] = new MyPoint(6.0, 1.1);
        p5[2] = new MyPoint(2.0, 1.1);
        p5[3] = new MyPoint(1.0, 1.1);
        p5[4] = new MyPoint(5.0, 1.1);

        System.out.println(MyPoint.Horizontal(p5));
    }
}
