package Arrays;

/*Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return
an array of the non-overlapping intervals that cover all the intervals in the input.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class array13 {
    public static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        if(intervals.length == 0 || intervals == null)
            return res.toArray(new int[0][]);
//        if there's nothing in the array, just return an empty list.

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//        sort the array based on the starting positions of the elements

        int start = intervals[0][0];
        int end = intervals[0][1];
        /*initialize two variables, start and end, which signify the starting and ending positions of the elements to
        be inserted into the list.*/

        for(int i = 0; i<intervals.length; i++){
            if(intervals[i][0] <=end){
                end = Math.max(end, intervals[i][1]);
            }
            else{
                res.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        /*the start value will remain the same for any number of intervals, so the end value keeps changing based upon
        the merges we're about to do. We compare the end [][0]th element of the next interval with the value of end
        and we replace the value of end by the maximum of these values. When there are no more intervals that can be
        merged, we add the start and end elements to the new list and then get new start and end values as shown in the
        code.*/

        res.add(new int[]{start, end});
        /*this is to add the last start and end values to the list(which have no intervals to merge with).*/

        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,4},{0,4}};

        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
/* for(int[] i : intervals) {
            if(i[0] <= end) {
                end = Math.max(end, i[1]);
            }
            else {
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        an alternative way to write the for loop.(for-each)*/