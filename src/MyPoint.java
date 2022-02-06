import java.lang.Math;

public class MyPoint {

    private double x = 0.0;
    private double y = 0.0;

    MyPoint() {}

    /**
     *  MyPoint constructor which takes two params
     * @param x desired value for X
     * @param y desired value for Y
     */
    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double GetX() {
        return this.x;
    }

    void SetX(double x) { this.x = x; }

    double GetY() {
        return this.y;
    }

    void SetY(double y) {
        this.y = y;
    }

    /**
     *
     * @return A string which contains the values of X and Y contained in Parentheses
     */
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     *
     * @param newPoint Takes an object of type MyPoint
     * @return the calculated distance between two sets of points (i.e. Euclidean Distance between Point A and Point B)
     */
    public double EuclideanDistance(MyPoint newPoint) {
        double distance = Math.sqrt(Math.pow((this.x - newPoint.GetX()), 2) + Math.pow((this.y - newPoint.GetY()), 2));

        return distance;
    }

    /**
     *
     * @param points An object array of type MyPoint which contains multiple coordinate points
     * @param p An object of type MyPoint to checking if the given coordinates are within array Points
     * @return True or False if p(x, y) can be found within points(x, y)
     */
    public static boolean Contains(MyPoint[] points, MyPoint p) {

        for(int i = 0; i < points.length; i++) {
            if (points[i].x == p.x && points[i].y == p.y) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param points An object array of type MyPoint which contains multiple coordinate points
     * @return True or False if all the Y values of points are equal to each other (i.e. Y points are Horizontal)
     */
    public static boolean Horizontal(MyPoint[] points) {
        boolean lineHorizontal = false;
        for (int i = 0; i < points.length; i++) {
            if (i < points.length - 1) {
                if (points[i].GetY() == points[i + 1].GetY()) {
                    lineHorizontal = true;
                } else {
                    return lineHorizontal = false;
                }
            }
        }
        return lineHorizontal;
    }
}
