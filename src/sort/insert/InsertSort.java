package sort.insert;

/**
 * Created by sunfan314 on 17/7/12.
 * 直接插入排序
 */
public class InsertSort {
    public static void insertSort(int[] array){
        if(array == null)
            return;
        for(int i=1;i<array.length;i++){
            int key = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
}
