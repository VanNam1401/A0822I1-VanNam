package demo.util;


import demo.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    //    ghi theo ký tự
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

    public static void writeStudentListToCSV2(String pathFile, List<Student> studentList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Student s : studentList) {
            stringList.add(s.getInfoToCSV());
        }
        write(pathFile, stringList, append);
    }

    // method dùng chung
    private static void write(String pathFile, List<String> stringList, boolean append) {
        File file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // đọc theo ký tự
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

    public static List<Student> readStudentFromCSV2(String pathFile) {
        List<Student> studentList = new ArrayList<>();
        List<String> stringList = read(pathFile);
        String[] array = null;
        for (String s : stringList) {
            array = s.split(",");
            Student student = new Student(Integer.parseInt(array[0]), array[1], array[2], Integer.parseInt(array[3]));
            studentList.add(student);
        }
        return studentList;
    }

    // file dùng chung
    private static List<String> read(String pathFile) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringList;
    }


    // ghi một list student vào trong file theo kiểu binary
    public static void writeStudentListObjectToCSV(String pathFile, List<Student> studentList) {
        File file = new File(pathFile);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentList);
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi kông tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
    }

    public static List<Student> readFileToStudentListObject(String pathFile) {
        List<Student> studentList = new ArrayList<>();
        File file = new File(pathFile);
        try {
            if (file.length() > 0) {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                studentList = (List<Student>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
