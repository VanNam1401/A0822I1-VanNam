package viettuts.input_output;

import java.io.*;

public class FilterInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FilterInputStream filterInputStream = null;
        try{
            fileInputStream = new FileInputStream(new File("src/viettuts/input_output/testout.txt"));
            filterInputStream = new BufferedInputStream(fileInputStream);
            int k ;
            while((k = fileInputStream.read()) != -1){
                System.out.print((char)k);
            }
        }catch (IOException e){
            System.out.println(e);
        }finally {
            fileInputStream.close();
            filterInputStream.close();
        }
    }
}
