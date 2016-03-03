import java.util.Scanner;

/**
 * Created by mona on 2/25/16.
 */
public class FunnyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_str;
        num_str = sc.nextInt();
        Boolean flag = true;
        char[] strb_arr, strb_rev_arr;
        for (int i = 0; i < num_str; i++) {
            StringBuilder strb = new StringBuilder(sc.nextLine());
            System.out.println(strb);
            StringBuilder str_reverse = strb.reverse();
            strb_arr = strb.toString().toCharArray();
            strb_rev_arr = str_reverse.toString().toCharArray();
            for (int k = 0; k < strb_arr.length; k++) {
                System.out.println(strb_arr[i]);
            }
            outerloop:

            for (int j = 1; j < strb_arr.length; j++) {
                System.out.println(Math.abs(strb_arr[j] - strb_arr[j - 1]));
                if (Math.abs(strb_arr[j] - strb_arr[j - 1]) != Math.abs(strb_rev_arr[j] - strb_rev_arr[j - 1])) {
                    System.out.println("Not funny");
                    return;
                    // break outerloop;

                }


            }

            //     if (flag=true) {
            //    System.out.println("Funny");
            //   }


        }


    }
}
