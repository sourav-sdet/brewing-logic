package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String args[]){

        HashSet<String> hset = new HashSet<>();


        // Add Items to a HashSet
        hset.add("gfg");
        hset.add("courses");
        System.out.println(hset);

        // Check if HashSet contains an item
        System.out.println(hset.contains("gfg"));


        // Iterate through a HashSet
        Iterator<String> iter = hset.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        //




    }



    
}
