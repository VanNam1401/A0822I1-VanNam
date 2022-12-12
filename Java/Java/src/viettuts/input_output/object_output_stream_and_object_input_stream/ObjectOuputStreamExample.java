package viettuts.input_output.object_output_stream_and_object_input_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOuputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = null;
        ObjectOutputStream objectOutputStream = null;
        try{
            file = new FileOutputStream("src/viettuts/input_output/object_output_stream_and_object_input_stream/test.txt");
            objectOutputStream = new ObjectOutputStream(file);
            Student student = new Student("Kien",19,281,"kienroro281@gmail.com");
            objectOutputStream.writeObject(student);
            objectOutputStream.flush();
        }catch(IOException e){
            System.out.println(e);
        }finally{
            objectOutputStream.close();
        }
    }
}
