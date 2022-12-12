package Case_study_new.services;

import Case_study_new.libs.CatchRegexString;
import Case_study_new.utils.ReadAndWriteFacility;

import java.util.List;
import java.util.Map;

public interface FacilityService<T> {
    void display();
    void addVilla(ReadAndWriteFacility readAndWriteFacility);
    void addHouse(ReadAndWriteFacility readAndWriteFacility);
    void addRoom(ReadAndWriteFacility readAndWriteFacility);
    void displayFacMaintain();
    Map<T,Integer> getList();
}
