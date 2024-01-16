import java.util.ArrayList;
import package1.Point;
import package1.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create points
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(1.0, 2.0);
        Point point3 = new Point(1.0, 3.0);
        Point point4 = new Point(1.0, 4.0);
        Point point5 = new Point(1.0, 5.0);
        Point point6 = new Point(2.0, 1.0);
        Point point7 = new Point(2.0, 2.0);
        Point point8 = new Point(2.0, 3.0);
        Point point9 = new Point(2.0, 4.0);
        Point point10 = new Point(2.0, 5.0);

        // Create an ArrayList of points
        ArrayList<Point> pointsList = new ArrayList<>();
        pointsList.add(point1);
        pointsList.add(point2);
        pointsList.add(point3);
        pointsList.add(point4);
        pointsList.add(point5);
        pointsList.add(point6);
        pointsList.add(point7);
        pointsList.add(point8);
        pointsList.add(point9);
        pointsList.add(point10);

        // Create a Shape object with the ArrayList of points
        Shape shape = new Shape(pointsList);

        // Calculate and print the perimeter, longest side, and average side
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongestSide());
    }
}
