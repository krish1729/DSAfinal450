package Arrays;
//to find kth min and max elements of an array

import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class array3 {

    public static void Swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void QuickSort(int[] a, int start, int end){
        if(start<end){
            int pIndex = Partition(a, start, end);
            QuickSort(a, start, pIndex - 1);
            QuickSort(a, pIndex + 1, end);
        }
    }

    public static int Partition(int[] a, int start, int end){
        int pivot = a[end];
        int pIndex = start;

        for(int i = start; i<end; i++){
            if(a[i] <= pivot){
                Swap(a, i, pIndex);
                pIndex++;
            }
        }
        Swap(a, pIndex, end);
        return pIndex;

    }

    public static int kthMin(int[] a, int k){
        return a[k - 1];
    }

    public static int kthMax(int[] a, int k){
        return a[a.length - k];
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {12, 3, 5, 7,4, 19, 26};
        int length = arr.length;

        QuickSort(arr, 0, length-1);

        System.out.println("Enter the element index you would like to find :");
        int kth = sc.nextInt();

        System.out.println("The kth Minimum element is : " + kthMin(arr, kth));
        System.out.println("The kth Maximum element is : " + kthMax(arr, kth));

    }
}
