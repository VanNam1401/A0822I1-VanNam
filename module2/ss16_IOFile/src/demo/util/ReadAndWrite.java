package demo.util;



import demo.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeStudentListToCSV(String pathFile, List<Student> studentList, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Student s : studentList) {
                bufferedWriter.write(s.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readStudentFromCSV(String pathFile) {
        List<Student> studentList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                Student student = new Student(Integer.parseInt(array[0]), array[1], array[2], Integer.parseInt(array[3]));
                studentList.add(student);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
