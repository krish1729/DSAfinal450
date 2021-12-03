package Arrays;

/*You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future
to sell that stock. Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.*/

public class array16 {
    /*public static int maxProfit(int[] prices){
        int n = prices.length;
        int min = 0;

        for (int j = n - 1; j>=0; j--) {
            int i = 0;
            while (j > i) {
                if (prices[i] > prices[j])
                    i++;
                else {
                    min = Math.max(min, prices[j] - prices[i]);
                    i++;
                }
            }
        }
        return min;
    }
    too much time taken for large inputs*/

    public static void main(String[] args) {
        int[] prices = {9,8,4,2,3,1,6,7};
        int max = 0;
        int min = prices[0];
        /*setting the default values of min and max to compare them to other elements of the array later*/

        for(int i = 1; i<prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
            }
//            if we find a value lesser than the current min value, we just update it.

            else{
                max = Math.max(max, prices[i] - min);
            }
            /*if we dont find a new  min value, we have to check whether the value the iterator is currently on
            can provide a maximum difference between itself and the min value.*/
        }
        System.out.println(max);
    }
}

