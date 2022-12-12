package viettuts.input_output;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) throws Exception {

            FileReader fileRead = new FileReader("src/viettuts/input_output/testout.txt");
            int i;
            while ((i = fileRead.read()) != -1){
                System.out.print((char) i);
            }
        }

}
