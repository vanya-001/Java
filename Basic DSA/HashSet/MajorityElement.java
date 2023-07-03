package HashSet;

import java.util.*;

// given an integer of size n, find all elements that appear more than [n/3] times
// frequency > n/3

public class MajorityElement {
    public static void majorityEle(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,3,2,5,1,3,1,5,1};
        majorityEle(nums);
        
    }
}
