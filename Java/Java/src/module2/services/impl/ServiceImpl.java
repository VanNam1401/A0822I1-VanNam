package module2.services.impl;

import module2.libs.CatchAgeException;
import module2.libs.CatchAgeExceptionImp;
import module2.libs.CatchRegexString;
import module2.libs.CatchRegexStringImp;
import module2.models.Student;
import module2.services.Service;
import module2.utils.ReadAndWriteStudent;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service {
    private static List<Student> studentsLists = new ArrayList<>();

    @Override
    public void addNewStudent(CatchRegexStringImp catchRegexStringImp, CatchAgeExceptionImp catchAgeExceptionImp, String pathFile) {
        if (new File(pathFile).exists()) {
            studentsLists =  new ReadAndWriteStudent().readFile(pathFile);
        }
        String id = String.valueOf(studentsLists.size() + 1);
        System.out.println("Ma so hoc sinh : " + id);
        System.out.println("Nhap ten sinh vien: ");
        String fullName = catchRegexStringImp.regexString();
        catchRegexStringImp.regexFullName(fullName);
        System.out.println("Nhap ngay sinh theo dinh dang dd/MM/yyyy: ");
        String date = catchRegexStringImp.regexString();
        catchAgeExceptionImp.checkDateOfBirth(date);
        System.out.println("Nhap gioi tinh");
        String gender = catchRegexStringImp.regexString();
        System.out.println("Nhap so dien thoai : ");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ma lop hoc");
        String idClass = catchRegexStringImp.regexString();
        Student student = new Student(id, fullName, date, gender, numberPhone, idClass);
        studentsLists.add(student);
        new ReadAndWriteStudent().writeFile(pathFile, studentsLists);
        System.out.println("them moi thanh cong");

    }

    @Override
    public void delStudent(String pathFile) {

        if (new File(pathFile).exists()) {
            studentsLists = (List<Student>) new ReadAndWriteStudent().readFile(pathFile);
        }
        System.out.println("Danh sach sinh vien");
        for(Student student : studentsLists){
            System.out.println(student.toString());
        }



    }

    @Override
    public void displayListStudent(String pathFile) {
        if (new File(pathFile).exists()) {
            studentsLists = new ReadAndWriteStudent().readFile(pathFile);
        }
        for(Student student: studentsLists){
            System.out.println(student.toString());
        }
    }

    @Override
    public void displayTeacher() {

    }

    @Override
    public void searchStudent(String pathFile) {
        if (new File(pathFile).exists()) {
            studentsLists = (List<Student>) new ReadAndWriteStudent().readFile(pathFile);
        }
        System.out.println("Nhap ten sinh vien: ");
        String searchName = scanner.nextLine();
        for(Student student : studentsLists){
            if(student.getFullName().equals(searchName)){
                System.out.println(student.toString());
            }
        }
    }
}
