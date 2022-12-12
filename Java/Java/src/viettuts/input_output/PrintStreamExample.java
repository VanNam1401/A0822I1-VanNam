package viettuts.input_output;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream file = new FileOutputStream("src/viettuts/input_output/testout.txt");
        PrintStream printStream = new PrintStream(file);
        printStream.println(2022);
        printStream.print("Hello");
        printStream.print(" Welcome to Java");
        printStream.flush();
        file.flush();
        printStream.close();
        file.close();
    }
}
