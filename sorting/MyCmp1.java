package sorting;

import java.util.Comparator;

public class MyCmp1 implements Comparator<Point3> {

    public int compare(Point3 p1, Point3 p2){
        
        return p1.x - p2.x;

    }


    
}

