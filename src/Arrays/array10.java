package Arrays;

/*Given an array of N integers arr[] where each element represents the max number of steps that can be made forward
from that element. Find the minimum number of jumps to reach the end of the array (starting from the first element).
If an element is 0, then you cannot move through that element. Note: Return -1 if you can't reach the end of the array.*/

public class array10 {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 7};

        System.out.println(minJumps(arr));
    }

    public static int minJumps(int[] arr){

        int max = 0, jump = 0, halt = 0;
        /*here, we take 3 variables : max - which represents the maximum reach of the particular element,
        jump - which stores the number of jumps performed, and halt - which signifies when the iterating
        index must stop for retrospection.*/

        if (arr[0] == 0) {
            return -1;
        }
//        if the first element is 0, then we can't move any further

        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(max, i + arr[i]);
//            the value of max will be equal to the maximum of max and the maximum reach of that particular element
            if (max >= arr.length - 1) {
                jump++;
                return jump;
            }
            /*if the max value is equal to or greater than the length of the array, it means that the length of the array
            has already been covered in the jumps taken.*/
            if (i == halt) {
                halt = max;
                jump++;
            }
            /*if the index is equal to halt, we make the next halt as the next maximum reachable index and add a jump to
            the jump counter.*/
        }
        if (halt >= arr.length - 1) {
            return jump;
        }
        /*if the halt is greater than or equal to the length of the array, it means that the entire array has been
        traversed, and the number of jumps is returned.*/

        else
            return -1;

    }
}
