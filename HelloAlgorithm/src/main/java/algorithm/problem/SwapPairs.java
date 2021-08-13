package algorithm.problem;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/13 21:38
 * @Description:
 * 24. 两两交换链表中的节点
 * 其实就和数组中的两两交换差不多,注意指针不能为空即可
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode preHead =new ListNode();
        preHead.next = head;
        ListNode ptr = preHead;
        while(ptr!=null&&ptr.next!=null&&ptr.next.next!=null){
            ListNode temp = ptr.next;
            ptr.next = ptr.next.next;
            temp.next = temp.next.next;
            ptr.next.next = temp;
            ptr = ptr.next.next;

        }
        return preHead.next;

    }
}
class ListNode {
      int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }}
