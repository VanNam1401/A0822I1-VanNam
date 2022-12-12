package viettuts.input_output;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {

            fileInputStream = new FileInputStream("src/viettuts/input_output/testout.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i;
            while((i = bufferedInputStream.read())!=-1){
                System.out.print((char) i);
            }
        }catch(IOException e){
            System.out.println(e);
        }finally {
            fileInputStream.close();
            bufferedInputStream.close();
        }
    }
}
