package Arrays;

/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.*/

import java.util.HashSet;
import java.util.Set;

public class array11 {
    public static void main(String[] args) {
        int nums[] = {1,3,5,4,2,3};
        int duplicate = 0;
//        we have a variable to store the duplicated value

        Set<Integer> find = new HashSet<Integer>();
        /*we create a set named 'find' in order to store each element of array in it iteratively. A set is preferred as
        it cannot store duplicate values.*/

        for(int i = 0; i<nums.length; i++){
            if(find.contains(nums[i])){
                duplicate = nums[i];
            }
            else{
                find.add(nums[i]);
            }
            /*here, first we check if the array element we are currently working with is in set or not. If it is in set, it
            means that it is a duplicate element. If it is not present in the set, it will be added to the set.*/
        }
        System.out.println(duplicate);
    }
}
