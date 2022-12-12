package case_study.utils.impl;

import Case_study_new.models.Employee;
import case_study.utils.ReadAndWriteEmployee;

import java.util.Collection;
import java.util.Comparator;

public class ReadAndWriteEmployeeImpl implements ReadAndWriteEmployee {
    @Override
    public void writeFile(String pathFile, Comparator<Employee> comparator) {

    }

    @Override
    public Collection<Employee> readFile(String pathFile) {
        return null;
    }
}
