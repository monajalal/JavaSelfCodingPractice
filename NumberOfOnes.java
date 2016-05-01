/**
 * Created by mona on 4/30/16.
 */
public class NumberOfOnes {
    public static int numSetBits(long a) {

        String binaryStr= Long.toBinaryString(a);
        int count=0;
        int len = binaryStr.length();
        for (int i=0; i<len; i++){
            if (String.valueOf(binaryStr.charAt(i)).equals("1")) {
                count++;
            }
        }
        return count;
    }

    public static void main (String[] argc){
        long a=11;
        System.out.println(numSetBits(a));

    }
}
