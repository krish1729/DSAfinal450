package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class array18 {
    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};

        int n1 = A.length;
        int n2 = B.length;
        int n3 = C.length;

        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while(i < n1 && j < n2 && k< n3){
            if(A[i] == B[j] && B[j] == C[k]){
                res.add(A[i]);
                i++;
                j++;
                k++;
            }
            else if(A[i] < B[j]){
                i++;
            }
            else if (B[j] < C[k]){
                j++;
            }
            else{
                k++;
            }
        }
        for (int x : res){
            System.out.print(x + " ");
        }
    }
}


 /*int s = n1 + n2 + n3;

        int[] all = new int[s];
        Set<Integer> res = new HashSet<>();

        for (int i = 0; i<n1; i++){
            all[i] = A[i];
        }
        for (int i = 0; i<n2; i++){
            all[n1 + i] = B[i];
        }
        for (int i = 0; i<n3; i++){
            all[n1 + n2 + i] = C[i];
        }

        for(int i = 0; i<n1; i++){
            int count = 0;
            for(int j = 0; j<s; j++){
                if(A[i] == all[j]){
                    count++;
                }
                if(count == 3){
                    res.add(A[i]);
                }
            }
        }    O(n*n) time complexity
        */
