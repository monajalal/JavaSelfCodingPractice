/**
 * Created by mona on 5/1/16.
 */
import java.util.Scanner;

public class FactoRial {

    public static long factorial(int n){
        if (n==1 || n==0){
            return 1;
        }
        else return n*factorial(n-1);
    }

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int  num;
        while (sc.hasNext()){
            num=Integer.parseInt(sc.next());
            if (num<0 || num>15){
                return;
            }
            else if (num<=15) {
                System.out.println(factorial(num));
            }
        }
    }
}
