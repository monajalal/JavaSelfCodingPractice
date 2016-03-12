/**
 * Created by mona on 3/11/16.
 */
import java.util.Scanner;
public class IOTrial {
    public void AllYourBases(){

    }

    public static void main (String[] args){
        int V=0;
        String tempStr=null;
        int strLen;
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        if (T>=1 && T<=100) {
            for (int i = 0; i < T; i++) {
                tempStr=sc.next();
                strLen=tempStr.length();
                if (strLen>=1 && strLen<10){
                    System.out.println("Case #" + i + ": " + V);
                }
            }
        }
    }
}

