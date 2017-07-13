package sort.insert;

/**
 * Created by sunfan314 on 17/7/12.
 */
public class ShellSort {
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
