package sorting;

import java.util.Comparator;

public class EvenOddComparator implements Comparator<Integer> {

    public int compare(Integer a, Integer b){
        return (a % 2) - (b %2);
    }

    
}
