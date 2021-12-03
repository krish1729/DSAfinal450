package Arrays;

/*Given an array of N integers, and an integer K, find the number of pairs of elements
in the array whose sum is equal to K.*/

import java.util.HashMap;

public class array17 {
    public static void main(String[] args) {
        int[] arr = {1,5,7,1};
        int n = arr.length;
        int k = 6;
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x : arr){
            if(x >= k){
                continue;
            }
            if(hm.containsKey(k - x)){
                count += hm.get(k - x);
            }
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        System.out.println(count);
    }
}
