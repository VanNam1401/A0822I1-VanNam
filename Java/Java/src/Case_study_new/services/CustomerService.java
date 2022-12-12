package Case_study_new.services;

import java.util.List;

public interface CustomerService<T> extends Service {
    List<T> getList();
}
