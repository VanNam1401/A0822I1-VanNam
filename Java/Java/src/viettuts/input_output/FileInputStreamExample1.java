package viettuts.input_output;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample1 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream("src/viettuts/input_output/testout.txt");
            int i = 0 ;
            while((i = fileInputStream.read()) != -1){
                System.out.print((char) i);
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
