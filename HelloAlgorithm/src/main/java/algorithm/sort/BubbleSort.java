package algorithm.sort;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/5/25 21:40
 * @Description: 这只是一个最简单的从小到大的冒泡排序
 */
public class BubbleSort {
    public void bubbleSort(int []array){
        for(int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


}
