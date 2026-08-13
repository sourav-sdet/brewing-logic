package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestPoint3 {


    public static void main(String args[]){

        // Collections.sort() for User Defined Types
        ArrayList<Point3> aList = new ArrayList<>();

        aList.add(new Point3(5,10));
        aList.add(new Point3(2,20));
        aList.add(new Point3(10,30));

        // Custom Comparator
        Collections.sort(aList, new MyCmp1());

        for(Point3 p: aList){
            System.out.println(p.x + " "+ p.y);
        }


    }

    
}
