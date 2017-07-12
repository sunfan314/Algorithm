package sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by sunfan314 on 17/7/12.
 */
public class AlgorithmTest {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomInt = random.nextInt(1000);
            int[] data = new int[randomInt];
            for (int j = 0; j < randomInt; j++) {
                data[j] = (int) (Math.random()*100);
            }
//            main.selectSort(data);
            if (ifOrdered(data))
                continue;
            else {
                System.out.println("Wrong Algorithm! Please check your code.");
                return;
            }

        }
        System.out.println("Right Algorithm!!!");

    }

    //检测数组是否以升序方式排列
    public static boolean ifOrdered(int[] array){
        int[] b = new int[array.length];
        for(int i=0;i<array.length;i++){
            b[i] = array[i];
        }
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            if(array[i] != b[i])
                return false;
        }
        return true;
    }
}
