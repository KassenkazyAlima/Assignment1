import java.util.ArrayList;
import package1.Point;
import package1.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/alimakairat/IdeaProjects/OOP_first_assignment/src/Add.txt");


        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }
        for (int i = 0; i < shape.getNumberOfPoints(); i++) {
            Point point1 = shape.getPoint(i);
            Point point2 = shape.getPoint((i + 1) % shape.getNumberOfPoints());
            double distance = point1.getDistance(point2);
            System.out.println("Distance between " + point1 + " and " + point2 + ": " + distance);
        }
        System.out.println("Perimeter " + shape.calculatePerimeter());
        System.out.println("Longest side " + shape.getLongestSide());
        System.out.println("Average side " + shape.getAverageSide());
        sc.close();
    }
}
