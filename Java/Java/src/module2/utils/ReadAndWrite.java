package module2.utils;

import java.util.Collection;
import java.util.List;

public interface ReadAndWrite<T> {
    void writeFile(String pathFile, Collection<T> collection);
    List<T> readFile(String pathFile);
}
