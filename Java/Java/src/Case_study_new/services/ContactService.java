package Case_study_new.services;

import Case_study_new.utils.ReadAndWrite;
import Case_study_new.utils.ReadAndWriteContract;

public interface ContactService {
    void creatNewContract(ReadAndWriteContract readAndWrite);
    void displayListContract(ReadAndWriteContract readAndWrite);
    void editContract(ReadAndWriteContract readAndWrite);
}
