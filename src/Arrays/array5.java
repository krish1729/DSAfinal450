//Given two arrays a[] and b[] of size n and m respectively. The task is to find union and intersection between these two arrays.


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class array5 {

    public static void doUnion(int a[], int n, int b[], int m){
        /*We are using a hashmap to find the union as hashmap can't store duplicate data values. So, we insert
        the values of both the given arrays into the map and thus, the duplicates don't get stored. So,
        we will have the union of both the arrays.*/


        Map<Integer,Integer> union = new HashMap<Integer,Integer>();

        for(int i = 0; i<n; i++){
            union.put(a[i], i);
        }
        for(int j = 0; j<m; j++){
            union.put(b[j], j);
        }

        Set<Integer> keys = union.keySet();
        for(int key: keys){
                System.out.print(key + " ");
        }
        System.out.println();

        System.out.println("The size of the union is : " + union.size());

    }


    public static void doIntersection(int a[], int n, int b[], int m){
        /*We are using a set data structure to store the elements of the intersection of the given arrays as a set is dynamic
        and is more useful in this context. We are not using arrays here as array size has to be pre-defined and while printing
        the array, we get 0's in all the unused array indices.*/

        Set<Integer> intersection = new HashSet<>();

        for (int i = 0; i< n; i++){
            for(int j = 0; j<m; j++){
                if(a[i] == b[j]) {
                    intersection.add(a[i]);
                }
            }
        }

        System.out.println(intersection);
    }


    public static void main(String[] args) {

        int a[] = {1,2,3,5,6};
        int n = a.length;
        int b[] = {1,3,4,6,9,11};
        int m = b.length;

        System.out.println("The union is : ");
        doUnion(a, n, b, m);
        System.out.println("The intersection is : ");
        doIntersection(a, n, b, m);

    }
}
