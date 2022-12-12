package viettuts.input_output;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterExample {
    public static void main(String[] args) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        FileWriter f1 = null;
        FileWriter f2 = null;
        FileWriter f3 = null;
        FileWriter f4 = null;
        try{
            f1 = new FileWriter("src/viettuts/input_output/file_char_array_writer/a.txt");
            f2 = new FileWriter("src/viettuts/input_output/file_char_array_writer/b.txt");
            f3 = new FileWriter("src/viettuts/input_output/file_char_array_writer/c.txt");
            f4 = new FileWriter("src/viettuts/input_output/file_char_array_writer/d.txt");
            char[] c;
            String str = "Welcome to Java";
            c = str.toCharArray();
            charArrayWriter.write(c);
            charArrayWriter.writeTo(f1);
            charArrayWriter.writeTo(f2);
            charArrayWriter.writeTo(f3);
            charArrayWriter.writeTo(f4);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            f1.close();
            f2.close();
            f3.close();
            f4.close();
            charArrayWriter.close();
        }
    }
}
