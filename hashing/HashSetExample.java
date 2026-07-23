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

        // Size of a HashSet
        System.out.println(hset.size());

        // Remove an item from HashSet
        hset.remove("ide");
        System.out.println(hset.size());

        // Iteration using For Each Loop
        for(String s: hset){
            System.out.println(s);
        }

        // isEmpty()
        System.out.println(hset.isEmpty());


        // clear() - used to clear the content of HashSet
        hset.clear();
        System.out.println(hset.isEmpty());



    }



    
}
