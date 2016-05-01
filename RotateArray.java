/**
 * Created by mona on 5/1/16.
 */
import java.util.ArrayList;

public class RotateArray {

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            ret.add(A.get((i + B)%A.size()));
        }
        return ret;
    }

    public static void main(String[] argc){

        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        ArrayList<Integer> b= rotateArray(a, 1);
        for (int i=0; i<b.size(); i++){
            System.out.print(b.get(i)+" ");
        }



    }
}
