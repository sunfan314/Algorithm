package sort.select;

/**
 * Created by sunfan314 on 17/7/12.
 */
public class HeapSort {

    public static int left(int i){
        return i*2+1;
    }

    public static int right(int i){
        return i*2+2;
    }

    public static void maxHeapify(int[] A,int heapSize,int i){
        int l = left(i);
        int r = right(i);
        int largest = i;
        if(l < heapSize && A[l] > A[i])
            largest = l;
        if(r < heapSize && A[r] > A[largest])
            largest = r;
        if(largest != i){
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            maxHeapify(A,heapSize,largest);
        }
    }

    public static void buildMaxHeap(int[] A){
        int heapSize = A.length;
        for(int i=(A.length-1)/2;i>=0;i--){
            maxHeapify(A,heapSize,i);
        }
    }

    public static void heapSort(int[] A){
        buildMaxHeap(A);
        int heapSize = A.length;
        for(int i=A.length-1;i>0;i--){
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            heapSize--;
            maxHeapify(A,heapSize,0);
        }

    }

    public static void main(String[] args){
        int[] A = {4,1,3,2,8,9,7,6};
        HeapSort.heapSort(A);
    }
}
