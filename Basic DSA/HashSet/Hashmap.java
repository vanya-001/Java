package HashSet;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        // Country population
        // Country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insert
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        // Insertion order => Unordered 
        System.out.println(map);

        map.put("India", 100);
        System.out.println(map);

        // Search or Lookup operation
        if(map.containsKey("Indonesia")){
            System.out.println("Yes! map contains China");
        }
        else{
            System.out.println("No! not present in the map");
        }
        
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        // Iteration
        // Types of for-loop:

        // int arr[] = {12,15,18};
        // for(int i=0; i<3; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // for(int val : arr){
        //     System.out.print(val + " ");
        // }
        // System.out.println();

        // for(Map.Entry<String, Integer> e : map.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }

        // Set<String> keys = map.keySet();
        // for(String key : keys){
        //     System.out.println(key + " " + map.get(key));
        // }

        // Remove
        map.remove("China");
        System.out.println(map);

    }
}
