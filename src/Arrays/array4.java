package Arrays;
/*
An array contains both positive and negative numbers in random order. Rearrange the array elements so that
all negative numbers appear before all positive numbers.

        Examples :

        Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
        Output: -12 -13 -5 -7 -3 -6 11 6 5
        Note: Order of elements is not important here.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class array4 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        rearrange(a);
        for(int x:a){
            System.out.println(x);
        }



    }

    public static void rearrange(int[] a){
        int pivot = 0;
        int index = 0;
        for(int i = 0; i< a.length; i++){
            if(a[i] < pivot){
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
                index++;
            }
        }
    }
}
