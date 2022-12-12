package viettuts.input_output;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderExample {
    public static void main(String[] args) throws IOException {
        char[] arr = {'J','a','v','a'};
        CharArrayReader reader = new CharArrayReader(arr);
        int k;
        while((k = reader.read()) != -1){
            char ch = (char) k;
            System.out.print(ch);
            System.out.println(" : " + k);
        }
        reader.close();
    }
}
