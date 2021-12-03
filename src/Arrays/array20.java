package Arrays;

public class array20 {
    public static void main(String[] args) {
        int N = 5;
        int product = 1;
        for (int i = N; i >= 1; i--) {
            product = product * i;
        }
        System.out.println(product);
    }
}
