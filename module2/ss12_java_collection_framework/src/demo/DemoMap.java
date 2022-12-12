import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        // lưu thông tín vắng nghỉ của học viên
        Map<Student,Integer> studentMap= new TreeMap<>();
        studentMap.put(new Student(1,"Luận","ĐN",34),3);
        studentMap.put(new Student(1,"Luận","ĐN",20),5);
        studentMap.put(new Student(2,"Thịnh","ĐN",18),10);
        studentMap.put(new Student(3,"Tiến","ĐN",19),1);
        studentMap.put(new Student(4,"Dũng","ĐN",23),4);
        // duyệt mạp
        Set<Student> studentSet = studentMap.keySet();
        for (Student s: studentSet) {
            System.out.println("Số ngày nghỉ của" + s.getName()+ ":" + studentMap.get(s));
        }
        // cách duyệt map 2
        for (Map.Entry<Student,Integer> entry: studentMap.entrySet()) {
            System.out.println("Số ngày nghỉ của " + entry.getKey().getName()+ " : " + entry.getValue());
        }

    }
}
