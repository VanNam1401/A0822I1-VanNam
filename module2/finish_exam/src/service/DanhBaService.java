package service;

import model.DanhBa;
import util.ConstantUtil;
import util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class DanhBaService implements Service<DanhBa> {
    private List<DanhBa> danhBas = new ArrayList<>();
    private static ReadAndWrite file = new ReadAndWrite();

    public DanhBaService() {
        readFile();
    }

    @Override
    public List<DanhBa> findAll() {
        return danhBas;
    }

    @Override
    public void create(DanhBa danhBa) {
        danhBas.add(danhBa);
    }

    @Override
    public void update(DanhBa danhBa) {

    }

    @Override
    public void delete(DanhBa danhBa) {
        danhBas.remove(danhBa);
        writeFile();
    }

    @Override
    public List<DanhBa> searchName(String name) {
        List<DanhBa> danhBaList = new ArrayList<>();
        for (DanhBa danhBa : danhBas) {
            if (danhBa.getName().equals(name)) {
                danhBaList.add(danhBa);
            }
        }
        return danhBaList;
    }

    @Override
    public List<DanhBa> searchPhone(String phoneNumber) {
        List<DanhBa> danhBaList = new ArrayList<>();
        for (DanhBa danhBa : danhBas) {
            if (danhBa.getPhoneNumber().equals(phoneNumber)) {
                danhBaList.add(danhBa);
            }
        }
        return danhBaList;
    }

    public DanhBa search(String phone) {
        for (DanhBa danhBa : danhBas) {
            if (danhBa.getPhoneNumber().equals(phone)) {
                return danhBa;
            }
        }
        return null;
    }
    public void readFile() {
        List<String> lines = file.read(ConstantUtil.PATH);
        for (String line : lines) {
            if (!line.isEmpty()) {
                String[] temp = line.split(",");
                String phoneNumber = temp[0];
                String group = temp[1];
                String name = temp[2];
                String sex = temp[3];
                String address = temp[4];
                String dateOfBirth = temp[5];
                String email = temp[6];
                DanhBa danhBa = new DanhBa(phoneNumber, group, name, sex, address, dateOfBirth, email);
                danhBas.add(danhBa);
            }
        }
    }

    public void writeFile() {
        file.write(ConstantUtil.PATH, danhBas, false);
    }
}
