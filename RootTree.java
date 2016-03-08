/**
 * Created by mona on 3/4/16.
 */
public class RootTree {
    static boolean isPowerOfThree(int n) {

     while (n%3==0){
         n=n/3;
     }
       return(n==1);
    }

    public static void main(String[] args){
        int a=125;
        System.out.println(isPowerOfThree(a));

    }
}
