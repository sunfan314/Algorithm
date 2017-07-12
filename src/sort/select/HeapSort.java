package sort.select;

/**
 * Created by sunfan314 on 17/7/12.
 */
public class HeapSort {

//    public static int left(int i){
//        return i*2;
//    }
//
//    public static int right(int i){
//        return i*2+1;
//    }

    public static int left(int i){
        return i*2+1;
    }

    public static int right(int i){
        return i*2+2;
    }

    /*
    MAX-HEAPIFY过程伪代码
    MAX-HEAPIFY(A,i)
        l = LEFT(i)
        r = RIGHT(i)
        if l <= A.heap-size and A[l] > A[i]
            largest = l
        else
            largest = i
        if r <= A.heap-size and A[r] > A[largest]
            largest = r
        if(largest != i)
            exchange A[i] with A[largest]
            MAX-HEAPIFY(A,largest)
     */
//    public static void maxHeapify(int[] A,int heapSize,int i){
//        int l = left(i);
//        int r = right(i);
//        int largest = i;
//        if(l <= heapSize && A[l] > A[i])
//            largest = l;
//        if(r <= heapSize && A[r] > A[largest])
//            largest = r;
//        if(largest != i){
//            int temp = A[i];
//            A[i] = A[largest];
//            A[largest] = temp;
//            maxHeapify(A,heapSize,largest);
//        }
//    }
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

    /*
    BUILD-MAX-HEAP过程伪代码
    BUILD-MAX-HEAP(A)
        A.heap-size = A.length
        for i  = A.length/2 downto 1
        MAX-HEAPIFY(A,i)
     */
//    public static void buildMaxHeap(int[] A){
//        int heapSize = A.length-1;
//        int length = A.length-1;
//        for(int i=length/2;i>0;i--){
//            maxHeapify(A,heapSize,i);
//        }
//    }

    public static void buildMaxHeap(int[] A){
        int heapSize = A.length;
        for(int i=(A.length-1)/2;i>=0;i--){
            maxHeapify(A,heapSize,i);
        }
    }

    /*
    HEAPSORT过程伪代码
    HEAPSORT(A)
        BUILD-MAX-HEAP(A)
        for i = A.length downto 2
            exchange A[1] with A[i]
            A.heap-size = A.heap-size - 1
            MAX-HEAPIFY(A,1)
     */
//    public static void heapSort(int[] array){
//        int[] A = new int[array.length+1];
//        for(int i=0;i<array.length;i++){
//            A[i+1] = array[i];
//        }
//        buildMaxHeap(A);
//        int heapSize = array.length;
//        for(int i=array.length;i>1;i--){
//            int temp = A[1];
//            A[1] = A[i];
//            A[i] = temp;
//            heapSize--;
//            maxHeapify(A,heapSize,1);
//        }
//        for(int i=0;i<array.length;i++){
//            array[i] = A[i+1];
//        }
//    }

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
