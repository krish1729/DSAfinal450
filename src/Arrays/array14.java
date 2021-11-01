package Arrays;

/*Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
If such an arrangement is not possible, it must rearrange it as the lowest possible order
(i.e., sorted in ascending order). The replacement must be in place and use only constant extra memory.*/

import java.util.Collections;
import java.util.Arrays;

public class array14 {
    public static void swap(int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    public static void reverse(int[] A, int i, int j){
        while(i < j){
            swap(A, i++, j--);
        }
    }
//    function to reverse the selected elements of a given array

    public static void nextPermutation(int[] nums) {
        if(nums.length <= 1 || nums == null){
            return;
        }
//        if the length of array is less than/equal to 1, it returns the array itself

        int i = nums.length - 2;
        /*we take a variable i, which serves as a measure to perform 1 of 2 performable operations - 1. if there exists
        an element of the array as specified by the while loop below, then i will at least be 0, and the while loop
        executes, 2. if however, there exists no such element in the array, which means the array is in its last
        possible permutation, the value of i will definitely be less than 0, in which case the entire array is reversed.*/

        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i >= 0){
            int j = nums.length - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
            /*logic to finding the element at the first index which satisfies a[i] < a[i+1] and swap it with the first
            element greater than a[i] while traversing from the end of the array*/
        }
        reverse(nums, i+1,nums.length-1);
//        logic to reverse all the elements of the array which are after the index i
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1};

        nextPermutation(nums);

        for(int x : nums){
            System.out.print(x + " ");
        }

    }
}
