package viettuts.input_output;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

public class PushbackInputStreamExample {
    public static void main(String[] args)throws Exception {
        String str = "1##2#34###12";
        byte[] bytes = str.getBytes();
        ByteArrayInputStream arr = new ByteArrayInputStream(bytes);
        PushbackInputStream pushbackInputStream = new PushbackInputStream(arr);
        int i;
        while((i = pushbackInputStream.read()) != -1){
            char k = (char) i;
            if(k == '#'){
                char j = (char)pushbackInputStream.read();
                if(j =='#'){
                    System.out.print("**");
                }else{
                    pushbackInputStream.unread(j);
                    System.out.print(k);

                }
            }else{
                System.out.print(k);
            }
        }

    }
}
