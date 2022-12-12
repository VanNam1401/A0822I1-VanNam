package case_study.utils;

import java.util.Collection;
import java.util.Comparator;

public interface ReadAndWrite<T> {
    void writeFile(String pathFile, Comparator<T> comparator);
    Collection<T> readFile(String pathFile);
}
