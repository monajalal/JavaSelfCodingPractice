/**
 * Created by mona on 2/20/16.
 */
import java.io.*;
import java.util.*;

public class ArraySum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tmp,sum=0;
        for (int i=0; i<n; i++) {
            tmp=sc.nextInt();
            sum+=tmp;
        }
        System.out.println(sum);
    }
}
