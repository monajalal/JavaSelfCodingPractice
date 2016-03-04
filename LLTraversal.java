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
    //doesn't pass the hackerrank tests!!!
    public static LLNode InsertNth(LLNode head, int data, int position) {
        LLNode newNode=new LLNode();
        LLNode tmp=head;
        newNode.data=data;
        int count=0;
        if (head!=null){
            if (position==0){
            newNode.next=head;
            }
            else{
                while (count!=position && tmp!=null){
                    count++;
                    tmp=tmp.next;
                }
                newNode.next=tmp.next.next;
                tmp.next=newNode;
            }

        }
        else{
            newNode.next=null;
            head=newNode;
        }
        return head;

    }

    public static void merge(LLNode head1, LLNode head2){
        LLNode newHead=new LLNode();
        newHead.data=Math.min(head1.data,head2.data);
        LLNode tmp1=head1;
        LLNode tmp2=head2;
        LLNode tmp=newHead;

        while (tmp1.next!=null & tmp2.next!=null){
            tmp.next.data=Math.min(tmp1.next.data, tmp2.next.data);
            tmp1=tmp1.next;
            tmp2=tmp2.next;
        }
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
        InsertNth(n1, 562, 1);

        LLTraversal llt=new LLTraversal();
        llt.Print(n1);


    }
}
