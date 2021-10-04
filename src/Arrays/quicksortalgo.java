public class quicksortalgo {

    public static void QuickSort(int[] A, int start, int end){
        if(start<end){
            int pIndex = Partition(A, start, end);
            QuickSort(A, start, pIndex - 1);
            QuickSort(A, pIndex + 1, end);
        }
    }

    public static int Partition(int[] A, int start, int end){
        int pivot = A[end];
        int pIndex = start;
        for(int i = start; i<end; i++){
            if(A[i] <= pivot){
                Swap(A, i, pIndex);
                pIndex++;
            }
        }
        Swap(A, pIndex, end);
        return pIndex;
    }

    public static void Swap(int A[], int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }


    public static void main(String[] args) {

        int A[] = {7,2,1,6,8,5,4};
        int n = A.length;
        QuickSort(A,0, n-1);

        for(int i = 0; i<n; i++){
            System.out.print(A[i]);
        }


    }
}
