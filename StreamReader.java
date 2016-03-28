/**
 * Created by mona on 3/21/16.
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class StreamReader  {
    public static void main(String[] args) throws java.io.IOException, java.lang.NumberFormatException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        /*
        char ch= br.readLine().charAt(0);

        System.out.println(ch);
        */
        /*
        int num= Integer.parseInt(br.readLine());
        System.out.println(num);
        */
        Double d = Double.valueOf(br.readLine());
        System.out.println(d.doubleValue());

    }



}
