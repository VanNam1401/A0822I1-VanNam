package Case_study_new.utils;

import Case_study_new.models.Facility;

import java.util.Map;


public interface ReadAndWriteFacility  {
    void writeFile(String path, Map<Facility, Integer> collection);
    Map<Facility,Integer> readFile(String path);
}
