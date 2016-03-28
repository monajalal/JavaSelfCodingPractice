/**
 * Created by mona on 3/23/16.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PerfectSquare {

    public static int numSqaures(int n){


        // Write your code here
        int[] dp = new int[n+1];

        for (int i=0; i<=n; i++){
            dp[i]=i;
        }

        for (int i=0; i<=n; i++){
            //  dp[i]=i;
            for (int j=0; j*j<=i; j++){
                //min(dp[i-j*j],dp[j*j])
                //dp[j*j]=1
                dp[i]=Math.min(dp[i-j*j]+1, dp[i]);

            }
        }

        return dp[n];


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(numSqaures(n));

    }
}
