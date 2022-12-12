package viettuts.input_output;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderExample {
    public static void main(String[] args) throws IOException {
        String str= "Hello Java\nWelcome to Java";
        StringReader stringReader = new StringReader(str);
        int k;
        while((k = stringReader.read()) != -1){
            System.out.println((char)k);
        }
    }
}
