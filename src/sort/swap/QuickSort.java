package sort.swap;

/**
 * Created by sunfan314 on 17/7/13.
 */
public class QuickSort {

    public static void quickSort(int[] A,int p,int r){
        if(p < r){
            int q = parition(A,p,r);
            quickSort(A,p,q-1);
            quickSort(A,q+1,r);
        }
    }

    public static int parition(int[] A,int p,int r){
        int key = A[r];
        int i = p-1;
        for(int j=p;j<r;j++){
            if(A[j] < key) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        A[r] = A[i+1];
        A[i+1] = key;
        return i+1;
    }

}
