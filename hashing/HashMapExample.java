package hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {


    public static void main(String args[]){

        HashMap<String, Integer> hmap = new HashMap<>();


        // Add Items to a HashMap
        hmap.put("gfg", 10);
        hmap.put("courses", 15);
        System.out.println(hmap);

        // Check if HashMap contains a key
        System.out.println(hmap.containsKey("gfg"));

        // Check if HashMap contains a value
        System.out.println(hmap.containsValue(15));

        // Get the value for a given key
        System.out.println(hmap.get("courses"));
        System.out.println(hmap.get("string"));

        // Iterate through a HashMap
        for(Map.Entry<String, Integer> e : hmap.entrySet()){
            System.out.println(e.getKey() + " "+ e.getValue());
        }

        // Size of a HashMap
        System.out.println(hmap.size());

        // // Remove a given key from HashMap
        hmap.remove("ide");
        System.out.println(hmap.size());



    }


    
}
