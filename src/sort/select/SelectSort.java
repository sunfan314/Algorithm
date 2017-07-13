package sort.select;

/**
 * Created by sunfan314 on 17/7/12.
 */
public class SelectSort {
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
