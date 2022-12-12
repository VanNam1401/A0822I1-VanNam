package viettuts.input_output;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        try{
            fileInputStream = new FileInputStream("src/viettuts/input_output/testout.txt");
            dataInputStream = new DataInputStream(fileInputStream);
            int count = fileInputStream.available();
            byte[] arr = new byte[count];
            dataInputStream.read(arr);
            for(byte a : arr){
                System.out.print((char)a+"-");
            }
        }catch (IOException e){
            System.out.println(e);
        }finally{
           dataInputStream.close();
        }
    }
}
