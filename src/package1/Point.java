
package package1;
import static java.lang.Math.sqrt;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){ // constructor having both parameters
        this.x = x;
        this.y = y;
    }


    public double getDistance(Point dest){
        double x1 = this.x;
        double x2 = dest.x;
        return (x1 * x1 + x2 * x2);
    }
    // toString
    public String toString(){
        return "(" + x + "," + y + ")" ;
    }


}
