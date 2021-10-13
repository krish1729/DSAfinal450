package Arrays;
//reverse the array

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//used bufferedreader and inputstreamreader objects to read a string of numbers in a line
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f = br.readLine();
// stores all elements seperated by a space as new elements in a new array
        String c[] = f.split("\\s+");
        int a[] = new int[c.length];
// converts string type to int type by storing new elements in a new array
        for (int i = 0; i< a.length; i++){
            a[i] = Integer.parseInt(c[i]);
        }

        int s = n;

        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[s - 1];
            s--;
        }
        for (int x : b) {
            System.out.print(x + " ");
        }
    }
}



