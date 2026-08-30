package sorting;

public class Interval implements Comparable<Interval> {

    int start;
    int end;

    public Interval(int start, int end){
        this.start = start;
        this.end = end;
    }

    public int compareTo(Interval i1){

        return this.start - i1.start;

    }
    
}
