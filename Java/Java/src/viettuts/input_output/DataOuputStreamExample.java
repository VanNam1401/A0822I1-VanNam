package viettuts.input_output;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOuputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("src/viettuts/input_output/testout.txt");
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeInt(65);
            dataOutputStream.flush();
            fileOutputStream.flush();
            System.out.println("Done");
        }catch (IOException e){
            System.out.println(e);
        }finally{
            fileOutputStream.close();
            dataOutputStream.close();
        }
    }
}
