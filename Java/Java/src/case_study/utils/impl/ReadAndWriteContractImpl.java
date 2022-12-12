package case_study.utils.impl;

import case_study.models.Contract;
import case_study.utils.ReadAndWriteContract;

import java.util.Collection;
import java.util.Comparator;

public class ReadAndWriteContractImpl implements ReadAndWriteContract {
    @Override
    public void writeFile(String pathFile, Comparator<Contract> comparator) {

    }

    @Override
    public Collection<Contract> readFile(String pathFile) {
        return null;
    }
}
