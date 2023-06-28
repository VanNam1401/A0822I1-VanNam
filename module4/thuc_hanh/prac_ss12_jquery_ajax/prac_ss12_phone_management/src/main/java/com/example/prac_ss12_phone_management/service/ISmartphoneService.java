package com.example.prac_ss12_phone_management.service;

import com.example.prac_ss12_phone_management.model.Smartphone;

import java.util.Optional;

public interface ISmartphoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartphone);

    void remove(Long id);
}
