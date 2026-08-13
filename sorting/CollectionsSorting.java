package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSorting {


    
    public static void main(String srgs[]){

        // Collections.sort() - for Collections implementing list interface
        // ArrayList, LinkedList

        List<Integer> aList = new ArrayList<>();
        aList.add(50);
        aList.add(10);
        aList.add(20);
        aList.add(70);

        Collections.sort(aList);
        System.out.println(aList);

        Collections.sort(aList, Collections.reverseOrder());
        System.out.println(aList);

    }
    
}
