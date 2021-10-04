// A shop had N number of sales each day for M days. Each day different types of items were sold
// and had different profits associated with them, but the quantity of items sold each day
// was the same. The owner of the shop wishes to know the minimum profit made each day. For
// this, a structure was formed in which profit for all different items for an individual day was
// kept in the same column for M days. Write an algorithm to find the minimum profit or each day individually

import java.util.Arrays;
import java.util.Scanner;

public class ndaysmsales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int itemsSold = sc.nextInt();
        int noOfDays = sc.nextInt();



        while (sc.hasNextLine())
        {
            String[] tokens = sc.nextLine().split("\\s");
            System.out.println(Arrays.toString(tokens));
        }

        sc.close();


    }
}
