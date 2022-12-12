package viettuts.input_output;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOuputExample {
    public static void main(String[] args) throws IOException {
            FileOutputStream file = null;
            FilterOutputStream filter = null;
        try{
            file = new FileOutputStream("src/viettuts/input_output/testout.txt");
            filter = new FilterOutputStream(file);
            String s = "Welcome to Java";
            byte[] b = s.getBytes();
            filter.flush();
            filter.write(b);
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            filter.close();
            file.close();
        }

    }
}
