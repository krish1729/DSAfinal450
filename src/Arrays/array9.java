package Arrays;
import java.util.Arrays;

/*Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the
height of each tower either by increasing or decreasing them by K only once. After modifying,
height should be a non-negative integer. Find out what could be the possible minimum difference
of the height of shortest and longest towers  after you have modified each tower.*/

public class array9 {
    public static void main(String[] args) {
        int arr[] = {3,9,12,16,20};
        int n = arr.length;
        int k = 3;


        Arrays.sort(arr);
//        sorting the given array

        int ans =  arr[n-1] - arr[0];
//        getting the initial maximum difference between towers for comparison purposes

        int smallest = arr[0]+k;
        int largest = arr[n-1]-k;
        /*to minimize the maximum difference between towers, we need to add the smallest tower by k and decrease the largest tower
        by k. So, we store these values in the two variables given above.*/

        int mi,ma;
        /*these are two variables, which at any given time will hold the minimum and maximum tower heights after performing either
        of the two operations on tower heights.*/

        for(int i =0; i< n-1; i++) {
            mi = Math.min(smallest, arr[i+1] - k);
            ma = Math.max(largest, arr[i] + k);
            /*for each index we traverse, we check if either increasing or decreasing the height by k yields new minimum and
            maximum values or not. We do this by comparing them with the existing smallest and largest variables. */

            if(mi < 0) continue;
            ans = Math.min(ans, ma - mi);
            /*now, we check if the difference of the obtained minimum and maximum values is minimum or not. If the difference is
            not minimum, even for the most minimum and maximum values in the entire array, they will be discarded in favour of
            the minimum difference between minimum and maximum values.*/
        }
        System.out.println(ans);
    }
}
