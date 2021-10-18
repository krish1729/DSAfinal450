package Arrays;

/*Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.*/

public class array4 {
    public static void main(String[] args) {
        int a[] = {0,2,1,2,0};
        int n = a.length;

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
//        counting all occurrences of 0's, 1's and 2's and storing them in the count variables.

        for(int i = 0; i<n; i++){
            if(a[i] == 0){
                count0++;
            }
            if(a[i] == 1){
                count1++;
            }
            if(a[i] == 2){
                count2++;
            }
        }

        for(int i = 0; i<count0; i++){
            a[i] = 0;
        }
        for(int i = count0; i<(count0+count1); i++){
            a[i] = 1;
        }
        for(int i = (count0+count1); i<n; i++){
            a[i] = 2;
        }
//        now, we replace the elements of the array with the number of 0's, 1's and 2's as per the count variables

        for (int x:a
             ) {
            System.out.print(x + " ");

        }

    }
}
