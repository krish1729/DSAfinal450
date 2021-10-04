//find minimum and maximum elements of array


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//user i/p for number of elements to be added

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String c[] = s.split("\\s+");
        int a[] = new int[c.length];
        for (int i = 0; i<c.length; i++){
            a[i] = Integer.parseInt(c[i]);
        }

        System.out.println(maxArray(a));
        System.out.println(minArray(a));


    }

    public static int maxArray(int[] a){
        int max = a[0];
        for(int i = 1; i<a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }

    public static int minArray(int[] a){
        int min = a[0];
        for (int i = 0; i<a.length; i++){
            if (min > a[i]){
                min = a[i];
            }
        }
        return min;
    }
}
