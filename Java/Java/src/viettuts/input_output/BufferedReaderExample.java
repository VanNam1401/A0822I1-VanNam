package viettuts.input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args)throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader("src/viettuts/input_output/testout.txt");
            bufferedReader = new BufferedReader(fileReader);
            String str;
            while((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }
            System.out.println("Done");
        }catch(Exception e){
            System.out.println(e);
        }finally{
            bufferedReader.close();
        }
    }
}
