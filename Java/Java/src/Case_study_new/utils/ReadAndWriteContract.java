package Case_study_new.utils;

import Case_study_new.models.Contract;

public interface ReadAndWriteContract extends ReadAndWrite<Contract> {
    void clear(String path);
}
