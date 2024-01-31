package package1;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points; // container of Points

    public Shape() {
        this.points = new ArrayList<>();
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
        double totalDistance = calculatePerimeter();
        int size = points.size();
        return totalDistance / size;

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
    public int getNumberOfPoints() {
        return points.size();
    }

    public Point getPoint(int i) {
        if (i >= 0 && i < points.size()) {
            return points.get(i);
        }
        return null;
    }


}
