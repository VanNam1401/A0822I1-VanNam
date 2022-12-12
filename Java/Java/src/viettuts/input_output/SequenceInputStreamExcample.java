package viettuts.input_output;

import java.io.*;

public class SequenceInputStreamExcample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream1 = null;
        FileInputStream fileInputStream = null;
        FileInputStream fileInputStream1 = null;
        SequenceInputStream sequenceInputStream = null;
        try{
            fileInputStream = new FileInputStream("src/viettuts/input_output/testout.txt");
            fileInputStream1 = new FileInputStream("src/viettuts/input_output/testout2.txt");
            fileOutputStream1 = new FileOutputStream("src/viettuts/input_output/textin.txt");
            sequenceInputStream = new SequenceInputStream(fileInputStream, fileInputStream1);
            int i ;
            while((i = sequenceInputStream.read()) != -1){
                fileOutputStream1.write(i);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            fileInputStream.close();
            fileInputStream1.close();
            fileOutputStream1.close();
            sequenceInputStream.close();

        }
    }
}
