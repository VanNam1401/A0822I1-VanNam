package service.impl;

import model.Manufacturer;

import java.util.ArrayList;
import java.util.List;

public class ManufactureService {
    private List<Manufacturer> manufacturerList = new ArrayList<>();

    public ManufactureService() {
        manufacturerList.add(new Manufacturer("HD", "Honda", "Japan"));
        manufacturerList.add(new Manufacturer("KI", "KIA", "Korea"));
        manufacturerList.add(new Manufacturer("AU", "Audi", "Germany"));
    }

    public List<Manufacturer> findAll() {
        return manufacturerList;
    }

    public Manufacturer findByName(String name) {
        for (Manufacturer manufacturer :
                manufacturerList) {
            if (manufacturer.getName().equals(name)) {
                return manufacturer;
            }
        }
        return null;
    }
}
