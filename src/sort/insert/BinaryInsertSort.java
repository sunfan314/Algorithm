package sort.insert;

/**
 * Created by sunfan314 on 17/7/12.
 * 二分法插入排序
 */
public class BinaryInsertSort {
    /*
    伪代码
    BINARY-INSERT-SORT(A)
        for i = 1 to A.length
            //Binary Search
            left = 0,right = i-1，key = A[i]
            //Pay attention to the end of the loop:left = right
            while(left<=right)
                midIndex = (left+right)/2
                if(A[midIndex]<key)
                    left = midIndex+1
                else
                    right = midIndex-1
            for j = i to left+1
                A[j] = A[j-1]
            A[left] = key
     */
    public static void binartInsertSotr(int[] array){
        if(array == null)
            return;
        for(int i=1;i<array.length;i++){
            int key = array[i];
            int left = 0;
            int right = i-1;
            /*
            注意二分查找的结束条件，left = right的情况不可少，left=right表示二分查找定位到了最后的一个数据，
            但是这个数据还没有和key进行比较
             */
            while(left<=right){
                int mid = array[(left+right)/2];
                if(key < mid)
                    right = (left+right)/2-1;
                //key = mid的情况，left定位到了二分点右侧，可以确保排序算法的稳定性
                else
                    left = (left+right)/2+1;
            }
            for(int j=i;j>left;j--){
                array[j] = array[j-1];
            }
            array[left] = key;
        }
    }
}
