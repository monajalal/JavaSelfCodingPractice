/**
 * Created by mona on 2/20/16.
 */
import java.util.*;

public class LongSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long sum=0;
        for (int i=0; i< n; i++){
            sum+=sc.nextLong();
        }
        System.out.println(sum);

    }
}