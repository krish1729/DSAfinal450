package Arrays;
import java.util.Arrays;

public class array19 {
    public static void main(String[] args) {
        int[] a = {4,2,-3,1,6};
        Arrays.sort(a);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if(a[i] == 0 || sum == 0){
                System.out.println(true);
            }
        }
    }
}
