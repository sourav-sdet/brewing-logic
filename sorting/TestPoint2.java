package sorting;

import java.util.*;

public class TestPoint2 {



    public static void main(String args[]){

        // Collections.sort() for User Defined Types
        ArrayList<Point2> aList = new ArrayList<>();

        aList.add(new Point2(5,10));
        aList.add(new Point2(2,20));
        aList.add(new Point2(10,30));

        // Custom Comparator
        Collections.sort(aList);

        for(Point2 p: aList){
            System.out.println(p.x + " "+ p.y);
        }


    }
    
}
