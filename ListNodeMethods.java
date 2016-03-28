/**
 * Created by mona on 3/26/16.
 */
public class ListNodeMethods {

    public static ListNode removeElements(ListNode head, int val){
        while (head!=null && head.val==val){
            head = head.next;
        }
        ListNode tmp=head;

        while (tmp!=null) {
            while (tmp.next!=null && tmp.next.val== val ) {
                tmp.next = tmp.next.next;
            }
            tmp=tmp.next;
        }
        if (tmp != null) {
            if (tmp.val == val) {
                tmp = null;
            }
        }
        return head;

    }

    public static void Print(ListNode head) {
        ListNode tmp = head;
        if (tmp != null) {
            while (tmp.next != null) {
                System.out.print(tmp.val + " ");
                tmp = tmp.next;
            }
            System.out.print(tmp.val);
        }

    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(0);
        //5->6->6->null
        n1.val = 5;
        n1.next = n2;

        n2.val = 6;
        n2.next = n3;

        n3.val = 6;
        n3.next = null;

        Print(n1);
        System.out.println();
        Print(removeElements(n1, 6));


    }
}
