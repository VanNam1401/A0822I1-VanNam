package Case_study_new.utils;

import java.util.Collection;

public interface ReadAndWrite<T> {
    void writeFile(String path, Collection<T> collection);
    Collection<T> readFile(String path);
}
