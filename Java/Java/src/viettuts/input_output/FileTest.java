package viettuts.input_output;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("src/viettuts/input_output/testout.txt");
        try {
            if(file.createNewFile()){
                System.out.println("Done");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
