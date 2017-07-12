package sort.swap;

/**
 * Created by sunfan314 on 17/7/12.
 */
public class BubbleSort {
    /*
    伪代码
    BUBBLE-SORT(A)
    //每趟可以将A[i]的值确定下来
    for i = A.length-1 downto 1
        for j=0 to i-1
            if A[j+1] < A[j]
                switch A[j] and A[j+1]
     */
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
