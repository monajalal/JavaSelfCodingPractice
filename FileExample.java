/**
 * Created by mona on 3/26/16.
 */
import java.io.*;

public class FileExample {

    //basically writing to a file and trying to read it
    //using both FileReader+BufferedReader
    //as well as FileInputStream
    public static void main (String[] args) throws java.io.IOException {

        File newFile = new File("tweet.txt");

        FileWriter fileWriter = new FileWriter(newFile);
        fileWriter.write("Mona Jalal");
        fileWriter.append("\nMona Mona");
        fileWriter.close();
        /*FileReader fileReader = new FileReader(newFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        fileReader.close();
        bufferedReader.close();
        */

        //try with resources pattern
        try (FileInputStream fis = new FileInputStream(newFile)) {
            System.out.println("fis");
            System.out.println(fis.read()); //prints 77
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            fis.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
