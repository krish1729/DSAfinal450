package Arrays;

/*Given an array, rotate the array by one position in clock-wise direction.*/

public class array6 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;

        int temp = arr[n - 1];
        /*storing the last element of the array in a temporary variable for future purposes*/

        for(int i = n - 1; i>0; i--){
            arr[i] = arr[i - 1];
        }
        /*shifting the place of array elements by one in clockwise direction from right to left*/

        arr[0] = temp;
        /*now assigning the element stored in temporary variable to the first element of the array*/

        for(int x : arr){
            System.out.println(x + " ");
        }
    }
}
