package v1.util;

import v1.model.Car;
import v1.model.Motor;
import v1.model.Truck;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    //ghi File theo ký tự
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

    public static void writeToFileMotor(String pathFile, List<Motor> motorList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Motor motor : motorList) {
            stringList.add(motor.toString());
        }
        write(pathFile, stringList, append);
    }

    public static void writeToFileCar(String pathFile, List<Car> motorList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Car car : motorList) {
            stringList.add(car.toString());
        }
        write(pathFile, stringList, append);
    }
    public static void writeToFileTruck(String pathFile, List<Truck> motorList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Truck truck : motorList) {
            stringList.add(truck.toString());
        }
        write(pathFile, stringList, append);
    }
}
