package data_structure.heap;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/11 10:37
 * @Description: null
 */
public interface Heap {
    public void siftUp(int i);
    public void siftDown(int i);
    public void insert();
    public void delete(int i);
    public int deleteMax();
    public void makeHeap(int [] newNums);
}
