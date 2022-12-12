package case_study.utils.impl;

import Case_study_new.models.Customer;
import case_study.utils.ReadAndWriteCustomer;

import java.util.Collection;
import java.util.Comparator;

public class ReadAndWriteCustomerImpl implements ReadAndWriteCustomer {
    @Override
    public void writeFile(String pathFile, Comparator<Customer> comparator) {

    }

    @Override
    public Collection<Customer> readFile(String pathFile) {
        return null;
    }
}
