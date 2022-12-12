package module2.services;

import module2.libs.CatchAgeException;
import module2.libs.CatchAgeExceptionImp;
import module2.libs.CatchRegexString;
import module2.libs.CatchRegexStringImp;

import java.util.Scanner;

public interface Service {
    Scanner scanner = new Scanner(System.in);
    void addNewStudent(CatchRegexStringImp catchRegexStringImp, CatchAgeExceptionImp catchAgeExceptionImp, String pathFile);
    void delStudent(String pathFile);
    void displayListStudent(String pathFile);
    void displayTeacher();
    void searchStudent(String pathFile);
}
