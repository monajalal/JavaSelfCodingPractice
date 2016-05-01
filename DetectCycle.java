/**
 * Created by mona on 4/30/16.
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
import java.util.HashSet;
import java.util.List;

public class DetectCycle {
    public static ListNode detectCycle(ListNode a) {
        HashSet<ListNode> nodeHash = new HashSet<>();
        while (a!=null){
            if (!nodeHash.contains(a)) {
                nodeHash.add(a);
                a = a.next;
            }
            else {
                return a;
            }
        }
        return null;


    }

    public static void main (String[] argc){
        ListNode n1=new ListNode(0);
        ListNode n2=new ListNode(0);
        ListNode n3=new ListNode(0);
        ListNode n4=new ListNode(0);

        n1.val=1;
        n1.next=n2;

        n2.val=3;
        n2.next=n3;

        n3.val=5;
        n3.next=n4;

        n4.val=2;
        n4.next=n2;

        System.out.println(detectCycle(n1).val);
    }
}

