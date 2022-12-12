package viettuts.input_output;

import java.io.FileWriter;

public class FileWriteExample {
    public static void main(String[] args) throws Exception{
        FileWriter fileWriter = new FileWriter("src/viettuts/input_output/testout.txt");
        int i = 123;
        char[] chars = {'h','e','l','l','o'};
        fileWriter.write("\n");
        fileWriter.write(chars);
        fileWriter.flush();
        fileWriter.close();
    }
}
