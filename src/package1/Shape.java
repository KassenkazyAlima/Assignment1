package package1;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points; // container of Points

    public Shape(ArrayList<Point> points) {
        this.points = points;
    }
    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter(){
        double perimeter = 0;
        int numPoints = points.size();

        for(int i = 0; i< numPoints;i++){
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i+1)% numPoints);

            perimeter += currentPoint.getDistance(nextPoint);
        }
        return perimeter;
    }

    public double getAverageSide(){
        double averageSide = 0;
        for(int i =0;i<points.size();i++){
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i+1) % points.size());

            averageSide += currentPoint.getDistance(nextPoint);
        }

        return averageSide/points.size();
    }

    public double getLongestSide() {
        double longestSide = 0;

        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());

            double distance = currentPoint.getDistance(nextPoint);

            if (distance > longestSide) {
                longestSide = distance;

            }
        }
        return longestSide;
    }

}