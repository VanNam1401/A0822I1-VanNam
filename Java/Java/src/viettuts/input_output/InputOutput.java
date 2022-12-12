package viettuts.input_output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class InputOutput {
    public static void main(String[] args) throws IOException {
//        System.out.println("Simple message");
//        System.err.println("Error message");
//        System.out.println("Nhap: ");
//        int a = System.in.read();
//        System.out.println((char)a);
        String text = System.console().readLine();
        System.out.println("Text "+ text);
    }
}
