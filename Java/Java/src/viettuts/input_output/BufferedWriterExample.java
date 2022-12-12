package viettuts.input_output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/viettuts/input_output/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "Welcome to Java IO";
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
        fileWriter.close();
    }
}
