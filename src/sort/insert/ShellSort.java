package sort.insert;

/**
 * Created by sunfan314 on 17/7/12.
 */
public class ShellSort {
    /*
    伪代码
    SHELL-SORT(A)
        if A.length <= 1 or A == null
            return
        increment  = A.length/2
        while increment > 0
            //Insert-sort A
            for i = 0..A.length-1
                key = A[i]
                j = i-inrement
                while j>=0 && A[j]>key
                    A[j+increment] = A[j]
                    j = j-increment
                A[j+increment] = key
            increment  = increment/2
     */
    public static void shellSort(int[] array){
        if(array == null || array.length <= 1)
            return;
        int increment = array.length/2;
        while(increment>0){
            for(int i=0;i<array.length;i++){
                int key = array[i];
                int j = i-increment;
                while(j >= 0 && array[j] > key){
                    array[j+increment] = array[j];
                    j = j-increment;
                }
                array[j+increment] = key;
            }
            increment = increment/2;
        }
    }

}
