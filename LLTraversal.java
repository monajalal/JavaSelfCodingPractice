/**
 * Created by mona on 3/3/16.
 */
public class LLTraversal{
    public static void Print(LLNode head){
        LLNode tmp=head;
        if (tmp!=null) {
            while (tmp.next != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println(tmp.data);
        }

    }
    public static LLNode Insert(LLNode head, int data){
        LLNode tmp=head;
        LLNode newNode = new LLNode();
        newNode .data=data;
        newNode.next=null;

        if (head!=null){
            while(tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.next=newNode;

        }
        return head;
    }

    public static LLNode InsertAtHead(LLNode head, int data){
        LLNode newNode = new LLNode();
        newNode.data=data;


        if (head!=null){
            newNode.next=head;
        }
        else{
            newNode.next=null;
        }

        return newNode;
    }

    public static Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.
    }


    public static void main(String[] args){
        LLNode n1=new LLNode();
        LLNode n2=new LLNode();
        LLNode n3=new LLNode();

        n1.data=1;
        n1.next=n2;

        n2.data=10;
        n2.next=n3;

        n3.data=76;
        n3.next=null;

        Insert(n1,34);
        InsertAtHead(n1,21);

        LLTraversal llt=new LLTraversal();
        llt.Print(n1);


    }
}
