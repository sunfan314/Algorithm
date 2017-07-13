package sort.swap;

/**
 * Created by sunfan314 on 17/7/12.
 */
public class BubbleSort {
    public static void bubbleSort(int[] A){
        if(A == null)
            return;
        int temp;
        for(int i=A.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(A[j] > A[j+1]){
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
    }
}
