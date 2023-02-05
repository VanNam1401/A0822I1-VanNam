package service;

import model.DanhBa;

import java.util.List;

public interface Service<E> {
    List<E> findAll();
    void create(E e);

    void update(DanhBa danhBa);
    void delete(DanhBa danhBa);
    List<E> searchPhone(String phoneNumber);
    List<E> searchName(String name);
}
