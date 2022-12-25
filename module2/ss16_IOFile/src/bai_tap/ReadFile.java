package bai_tap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<National> readFile(String path) {
        List<National> nationals = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            String[] array = null;
            while ((line = br.readLine()) != null) {
                array = line.split(",");
                National national = new National(Integer.parseInt(array[0]), array[1], array[2]);
                nationals.add(national);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File khong ton tai hoa noi dung co loi");
        }
        return nationals;
    }

    public static void main(String[] args) {
        List<National> result = new ArrayList<>();
        result = readFile("src/bai_tap/nation.csv");
        for (National national :
                result) {
            System.out.println(national);
        }
    }
}
