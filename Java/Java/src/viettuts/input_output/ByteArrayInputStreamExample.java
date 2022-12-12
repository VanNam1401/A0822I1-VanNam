package viettuts.input_output;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream byteArrayInputStream = null;
        try{
            byte[] buf = {35,36,37,38};
            byteArrayInputStream = new ByteArrayInputStream(buf);
            int k ;
            while((k = byteArrayInputStream.read()) != -1){
                char ch = (char) k;
                System.out.println("ASCII value of Character is:" + k + "; "
                        + "Special character is: " + ch);
            }
        } finally {
            byteArrayInputStream.close();
        }
    }
}
