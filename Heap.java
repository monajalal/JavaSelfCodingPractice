/**
 * Created by mona on 5/25/16.
 */
public class Heap {
    private int[] heap;
    private int size;
    private int maxSize;


    public Heap(int maxSize) {
        this.maxSize=maxSize;
        this.size=0;
        heap=new int[this.maxSize+1];
    }

    private int parent(int pos) {
        return pos/2;
    }

    private int leftChild(int pos) {
        return pos*2;
    }

    private int rightChild(int pos) {
        return pos*2 +1;
    }

    private boolean isLeaf(int pos) {
        if (pos>=size/2 && pos<=size) {
            return true;
        }
        return false;
    }

    private void swap(int pos1, int pos2) {
        int tmp=heap[pos1];
        heap[pos1]=heap[pos2];
        heap[pos2]=tmp;
    }


    private void maxHeapify(int pos) {
        if (!isLeaf(pos)){
            if ((heap[pos] < heap[leftChild(pos)]) ||
               (heap[pos] < heap[rightChild(pos)])) {
            if (heap[leftChild(pos)] > heap[rightChild(pos)]) {
                swap(pos , leftChild(pos));
                maxHeapify(leftChild(pos));
            }
            else {
                swap(pos , rightChild(pos));
                maxHeapify(rightChild(pos));
            }

            }

        }
    }

    public void maxHeap() {
        for (int i=(size/2) ; i>=1 ; i--) {
            maxHeapify(i);
        }
    }

    public void insert(int n) {
        heap[++size] = n;
        int tmpLocation = size;
        while (heap[tmpLocation] > heap[parent(tmpLocation)]){
            swap(tmpLocation , parent(tmpLocation));
            tmpLocation=parent(tmpLocation);
        }


    }

    public int remove() {
        int removed = heap[1];
        heap[1] = heap[size-1];
        maxHeapify(1);
        return removed;
    }

    public void print() {
        for (int i=0 ; i<=(size/2) ; i++) {
            System.out.println("current node is: "+heap[i]+" its left child is" +
                    heap[i*2]+" its right child is "+heap[i*2 +1]);
        }

    }

    public static void main(String[] args) {
        Heap heap = new Heap(9);
        heap.insert(8);
        heap.insert(18);
        heap.insert(28);
        heap.insert(9);
        heap.insert(12);
        heap.insert(90);
        heap.insert(1);
        heap.insert(87);
        heap.maxHeap();

        heap.print();
        System.out.println("Max is: "+heap.remove());

    }


}
