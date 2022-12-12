package viettuts.input_output;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOuputStreamExample {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("src/viettuts/input_output/testout.txt");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String str = "Welcome to Java";
            byte[] subStr = str.getBytes();
            try {
                bufferedOutputStream.write(subStr);
                bufferedOutputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
