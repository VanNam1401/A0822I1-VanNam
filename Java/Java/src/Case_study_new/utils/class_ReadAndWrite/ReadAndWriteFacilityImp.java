package Case_study_new.utils.class_ReadAndWrite;

import Case_study_new.models.Employee;
import Case_study_new.models.Facility;
import Case_study_new.utils.ReadAndWriteFacility;

import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ReadAndWriteFacilityImp implements ReadAndWriteFacility {

    @Override
    public void writeFile(String path, Map<Facility, Integer> collection) {
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(path);
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
    public Map<Facility,Integer> readFile(String path) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Map<Facility, Integer> collection = null;
        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            collection = (Map<Facility, Integer>) objectInputStream.readObject();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        } finally {
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