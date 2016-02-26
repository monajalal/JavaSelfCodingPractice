import java.util.Scanner;

/**
 * Created by mona on 2/25/16.
 */
public class HourglassDetection {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tmp;
        int max_sum=Integer.MIN_VALUE;
        int max_i=0, max_j=0;
        int a[][]=new int[6][6];
        for (int i=0; i<6; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                tmp=a[i][j]+a[i][j+1]+a[i][j+2]+
                        a[i+1][j+1]+
                        a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                if (max_sum<tmp){
                    max_sum=tmp;
                    max_i=i;
                    max_j=j;
                }



            }
        }

        System.out.println(max_sum);
        //System.out.println(max_i);
        //System.out.println(max_j);
    }
}
