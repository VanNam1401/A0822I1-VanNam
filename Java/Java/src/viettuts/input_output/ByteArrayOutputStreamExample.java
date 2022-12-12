package viettuts.input_output;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout1 = null;
        FileOutputStream fout2 = null;
        ByteArrayOutputStream baos = null;
        try{
            fout1 = new FileOutputStream("src/viettuts/input_output/file_byte_array_output_steam/f1.txt");
            fout2 = new FileOutputStream("src/viettuts/input_output/file_byte_array_output_steam/f2.txt");
            baos = new ByteArrayOutputStream();
            String str = "Hello";
            baos.write(str.getBytes());
            baos.writeTo(fout1);
            baos.writeTo(fout2);
            fout1.flush();
            fout2.flush();
            baos.flush();
            System.out.println("Done");
        }catch(IOException e){
            System.out.println(e);
        }finally{
            fout1.close();
            fout2.close();
            baos.close();
        }
    }
}
