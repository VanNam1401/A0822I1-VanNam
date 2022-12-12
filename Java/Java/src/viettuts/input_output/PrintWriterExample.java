package viettuts.input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) throws FileNotFoundException {
        //Dữ liệu được ghi vào console sử dụng lớp PrintWriter
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Hello Welcome");
        writer.flush();
        writer.close();

        //Dữ liệu được ghi vào file dược sử dụng PrintWriter
        PrintWriter writer1 = new PrintWriter(new File("src/viettuts/input_output/testout.txt"));
        writer1.write("Hello chao mn");
        writer.flush();
        writer1.close();
    }

}
