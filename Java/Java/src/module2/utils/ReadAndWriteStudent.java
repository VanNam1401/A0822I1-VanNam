package module2.utils;


import module2.models.Student;

import java.io.*;
import java.util.Collection;
import java.util.List;

public class ReadAndWriteStudent implements ReadAndWrite<Student> {
    @Override
    public void writeFile(String pathFile, Collection<Student> collection) {
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(pathFile);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(collection);
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }

    @Override
    public List<Student> readFile(String pathFile) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        List<Student> collection = null;
        try {
            fileInputStream = new FileInputStream(pathFile);
            objectInputStream = new ObjectInputStream(fileInputStream);
            collection = (List<Student>) objectInputStream.readObject();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        return collection;

    }
}
