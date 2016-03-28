/**
 * Created by mona on 3/3/16.
 */
public class LLTraversal {
    public static void Print(LLNode head) {
        LLNode tmp = head;
        if (tmp != null) {
            while (tmp.next != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println(tmp.data);
        }

    }

    public static LLNode Insert(LLNode head, int data) {
        LLNode tmp = head;
        LLNode newNode = new LLNode();
        newNode.data = data;
        newNode.next = null;

        if (head != null) {
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;

        }
        return head;
    }

    public static LLNode removeElements(LLNode head, int val) {
        while (head!=null){
            if (head.data == val) {
                head = head.next;
            }
            else break;
        }
        LLNode tmp = new LLNode();
        tmp.next = head;

        while (tmp.next != null && tmp.next.next!=null) {
            if (tmp.next.data == val) {
                tmp.next = tmp.next.next;
            }
            tmp = tmp.next;
        }
        if (tmp!=null){

            if (tmp.data==val){
                tmp=tmp.next;
            }
        }
        if (tmp.next!=null){
            if (tmp.next.data==val){
                tmp.next=null;
            }
        }


        return head;


    }

    public static LLNode InsertAtHead(LLNode head, int data) {
        LLNode newNode = new LLNode();
        newNode.data = data;


        if (head != null) {
            newNode.next = head;
        } else {
            newNode.next = null;
        }

        return newNode;
    }

    //doesn't pass the hackerrank tests!!!
    public static LLNode InsertNth(LLNode head, int data, int position) {
        LLNode newNode = new LLNode();
        LLNode tmp = head;
        newNode.data = data;
        int count = 0;
        if (head != null) {
            if (position == 0) {
                newNode.next = head;
            } else {
                while (count != position && tmp != null) {
                    count++;
                    tmp = tmp.next;
                }
                newNode.next = tmp.next.next;
                tmp.next = newNode;
            }

        } else {
            newNode.next = null;
            head = newNode;
        }
        return head;

    }

    public static void merge(LLNode head1, LLNode head2) {
        LLNode newHead = new LLNode();
        newHead.data = Math.min(head1.data, head2.data);
        LLNode tmp1 = head1;
        LLNode tmp2 = head2;
        LLNode tmp = newHead;

        while (tmp1.next != null & tmp2.next != null) {
            tmp.next.data = Math.min(tmp1.next.data, tmp2.next.data);
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
        }
    }

    public static LLNode reverseList(LLNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }


        LLNode headNext = head.next;

        head.next = null;

        LLNode reverseHeadNext = reverseList(headNext);


        headNext.next = head;

        return reverseHeadNext;
    }


    public static boolean isPalindrome(LLNode head) {
        LLNode headCopy = head;
        LLNode reverseHead = reverseList(headCopy);
        LLNode tmp1 = head;
        LLNode tmp2 = reverseHead;
        if (tmp1 != null) {
            while (tmp1.next != null) {
                if (tmp1.data != tmp2.data) {
                    return false;
                } else {
                    tmp1 = tmp1.next;
                    tmp2 = tmp2.next;
                }
            }
            if (tmp1.data != tmp2.data) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        LLNode n1 = new LLNode();
        LLNode n2 = new LLNode();
        LLNode n3 = new LLNode();
        LLNode n4 = new LLNode();
        LLNode n5 = new LLNode();
        LLNode n6 = new LLNode();
        LLNode n7 = new LLNode();
        //  LLNode n33=new LLNode();
        //1->2->3->3->4->5->3, 3
        n1.data = 1;
        n1.next = n2;

        n2.data = 2;
        n2.next = n3;

        n3.data = 3;
        n3.next = n4;

        n4.data = 3;
        n4.next = n5;

        n5.data = 4;
        n5.next = n6;

        n6.data = 5;
        n6.next = n7;

        n7.data = 3;

        // n22.data=1;
        // n22.next=n33;

        // n33.data=1;
        // n33.next=null;

        //Insert(n1,34);
        //InsertAtHead(n1,21);
        //InsertNth(n1, 562, 1);

        LLTraversal llt = new LLTraversal();
        llt.Print(n1);
        // LLNode n=reverseList(n1);
        // Print(n);
        System.out.println(isPalindrome(n1));
        llt.Print(removeElements(n1, 3));


    }
}
