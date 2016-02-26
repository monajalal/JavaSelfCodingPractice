/**
 * Created by mona on 2/20/16.
 */

import java.util.*;
import java.lang.Math;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr= new int[n][n];
        int main_diag=0, other_diag=0;
        int cnt=0;
        while (cnt<n) {
            for (int j = 0; j < n; j++) {
                arr[cnt][j] = sc.nextInt();
                if (cnt==j){
                    main_diag+=arr[cnt][j];
                }
                if (cnt+j+1==n){
                    other_diag+=arr[cnt][j];

                }

            }
            cnt++;
        }

        System.out.println(Math.abs(main_diag - other_diag));


    }
}
