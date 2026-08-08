package sorting;

public class Point implements Comparable<Point>{

    int x, y;

    // Constructor
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // compareTo()
    public int compareTo(Point p){
        return this.x - p.x;
    }



    
}
