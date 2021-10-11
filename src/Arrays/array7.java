package Arrays;

/*Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the
maximum sum and return its sum.(Kadane's Algorithm)*/

public class array7 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,-2,5};
        int n = arr.length;

        int maxSub[] = new int[n];
        maxSub[0] = arr[0];
        /*creating a new array called maxSub to store the larget contiguous subarrays ending at each index. It's first element is
        the first element of the original array as there are no contiguous subarrays ending at index 1.*/

        for(int i = 1; i<n; i++){
            if(arr[i] > (maxSub[i-1]+arr[i])){
                maxSub[i] = arr[i];
            }
            else{
                maxSub[i] = (maxSub[i-1]+arr[i]);
            }
        }
        /*here, we apply the Kadane's theorem logic, i.e. to find the maximum contiguous subarray at an index 'i',
        it is the maximum of i and the maximum subarray of the previous index.*/

        int max = maxSub[0];
        for(int i = 1; i<n; i++){
            if(maxSub[i] > max){
                max = maxSub[i];
            }
        }
        /*now, we return the maximum element of the maxSub array, which consists of the sums of the maximum contiguous subarrays
        at those particular subarrays in the original array, i.e. 'arr'.*/

        System.out.println(max);
    }
}
