import java.io.*;

/**
 * Created by mona on 5/16/16.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class WordsCharsLines {

    public static int countWords(File file) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        List<String> strList = new ArrayList<>();
        int count=0;
        while ((line=br.readLine())!=null){
            /*
            String[] strArray= line.split("\\s+");
            for (int i=0; i<strArray.length;i++){
                strList.add(strArray[i]);
            }
            */
            StringTokenizer st = new StringTokenizer(line);
            count+= st.countTokens();

        }
        //return strList.size();
        return count;

    }

    public static int countChars(File file) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int size=0;
        while ((line=br.readLine())!=null) {
            char[] charArray = line.toCharArray();
            size += charArray.length;
        }
        return size;
    }

    public static int countLines(File file) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(file));
        int numLines=0;
        String line;
        while ((line=br.readLine())!=null){
            if (!"".equals(line)) {
                numLines++;
            }
        }
        return numLines;
    }

    public static void main(String[] args) throws IOException{
        File file = new File("tweet.txt");
        System.out.println(countWords(file));
        System.out.println(countChars(file));
        System.out.println(countLines(file));

    }



}
