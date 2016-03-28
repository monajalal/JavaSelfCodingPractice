/**
 * Created by mona on 3/23/16.
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        // Write your code here
        String s="0";
        for (int i=0; i<digits.length; i++) {
            s += String.valueOf(digits[i]);
        }
        int finalNum=Integer.parseInt(s);
        String tmp=String.valueOf(++finalNum);
        //tmp="\""+tmp+"\"";
        String[] num= tmp.split("");
        /*System.out.println("after split");
        for (int i=0; i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        */
        System.out.println(num.length);
        int [] newDigits= new int[num.length];
        for (int i=0; i<newDigits.length; i++){
            newDigits[i]=Integer.parseInt(num[i]);
        }
        return newDigits;
    }

    public static void main (String[] args){
        int[] num={0};
        int[] newNum = plusOne(num);
        System.out.println();
        System.out.printf("final result");
        System.out.println();
        for (int i=0; i<newNum.length; i++){
            System.out.print(newNum[i]+" ");
        }

    }

}
