package sorting;

import java.util.Comparator;

public class MyCmp implements Comparator<Point1> {

    public int compare(Point1 p1, Point1 p2){
        
        return p1.x - p2.x;

    }


    
}
