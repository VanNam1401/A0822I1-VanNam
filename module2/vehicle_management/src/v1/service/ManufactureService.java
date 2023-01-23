package v1.service;

import v1.model.Manufacture;

import java.util.ArrayList;
import java.util.List;

public class ManufactureService {
    private List<Manufacture> manufactures = new ArrayList<>();

    public ManufactureService() {
        manufactures.add(new Manufacture("HD", "Honda", "Japan"));
        manufactures.add(new Manufacture("KI", "KIA", "Korea"));
        manufactures.add(new Manufacture("AU", "Audi", "Germany"));
    }

    public List<Manufacture> findAll() {
        return manufactures;
    }

    public Manufacture findByName(String name) {
        for (Manufacture manufacture :
                manufactures) {
            if (manufacture.getCode().equals(name)) {
                return manufacture;
            }
        }
        return null;
    }
}
