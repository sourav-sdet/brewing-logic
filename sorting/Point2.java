package sorting;

public class Point2 implements Comparable<Point2> {

    int x, y;

    // Constructor
    Point2(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point2 p){
        return this.x - p.x;
    }
    
}
