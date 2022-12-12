package viettuts.input_output;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamExample2 {
    public static void main(String[] args) throws IOException {
        /**
         * đọc dữ liệu nhiều hơn 2 file sử dụng lớp Vector , Enumeration
         */

        // tạo đối tượng FileInputStream cho tất cả các file
        FileInputStream a = new FileInputStream("src/viettuts/input_output/file/a.txt");
        FileInputStream b = new FileInputStream("src/viettuts/input_output/file/b.txt");
        FileInputStream c = new FileInputStream("src/viettuts/input_output/file/c.txt");
        FileInputStream d = new FileInputStream("src/viettuts/input_output/file/d.txt");

        Vector<FileInputStream> v = new Vector<>();
        v.add(a);
        v.add(b);
        v.add(c);
        v.add(d);

        Enumeration<FileInputStream> e = v.elements();
        SequenceInputStream sequenceInputStream = new SequenceInputStream(e);
        int i;
        while((i = sequenceInputStream.read()) != -1){
            System.out.print((char) i);
        }
        a.close();
        b.close();
        c.close();
        d.close();
        sequenceInputStream.close();
    }
}
