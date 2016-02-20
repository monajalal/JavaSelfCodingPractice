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
        int main_diag, other_diag=0;
        int cnt=0;
        while (cnt<n) {
            for (int j = 0; j < n; j++) {
                arr[cnt][j] = sc.nextInt();
                if (cnt==j){
                    main_diag+=arr[cnt][j];
                }
                if (cnt+j==n+1){
                    other_diag+=arr[cnt][j];
                }

            }
            cnt++;
        }
        /*
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.println(arr[i][j]);
            }
        }
        */
        System.out.println(abs(main_diag - other_diag));


    }
}
