package bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyText {
    public static List<Integer> readFile(String path) {
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
        } catch (Exception e) {
            System.out.println("File khong ton tai");
        }
        return list;
    }

    public static void writeFile(String path, List<Integer> list) {
        File file = new File(path);

        try {
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Integer integer : list) {
                bufferedWriter.write(integer.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Integer> array = readFile("src/bai_tap/text.csv");
        writeFile("src/bai_tap/result.csv", array);
    }
}
