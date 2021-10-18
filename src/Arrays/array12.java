package Arrays;
import jdk.nashorn.internal.ir.IfNode;

import java.util.Arrays;

import java.util.Scanner;

public class array12 {
    public static void Swap(int arr1[], int arr2[], int a, int b){
        int temp = arr2[b];
        arr2[b] = arr1[a];
        arr1[a] = temp;
    }
//    function to swap two elements of two given arrays

    public static void merge(int arr1[], int arr2[], int m, int n){
        int point = m-1;
//        this is a variable used to compare all the elements of array2 against

        for (int i = 0; i<n; i++) {
            if (arr1[point] > arr2[i]) {
                Swap(arr1, arr2, point, i);
                point--;
            } else if (arr1[point] < arr2[i]) {
                continue;
            }

        }
        /*we start with taking 'point' variable as the last element of array1, and 'i' as the first element of array2.
        If we find that point > i of their respective arrays, we swap them. If not , we let 'i' iterate and let point
        stay the same. This leads to all the elements being in their correct arrays.*/
    }

    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};

        int m = arr1.length;
        int n = arr2.length;

        merge(arr1, arr2, m, n);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
//        after we merge the arrays, we sort them to get the correct positions

        for(int x : arr1){
            System.out.print(x + " ");
        }
        System.out.println();
        for(int y : arr2){
            System.out.print(y + " ");
        }
    }
}
