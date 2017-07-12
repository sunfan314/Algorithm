package sort.select;

/**
 * Created by sunfan314 on 17/7/12.
 */
public class SelectSort {
    /*
    伪代码
        SELECT-SORT(A)
        for i = 0..A.length-2
            max = A[i]
            index = i
            for j = i..A.length-1
                if A[j] >max
                    max = A[j]
                    index = j
            temp = A[i]
            A[i] = max
            A[index] = temp
     */
    public static void selectSort(int[] array){
        for(int i=0;i<array.length;i++){
            int min = array[i];
            int index = i;
            for(int j=i;j<array.length;j++){
                if(array[j] < min){
                    min = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[index] = temp;
        }
    }
}
