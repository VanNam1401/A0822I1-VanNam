package com.example.prac_ss12_phone_management.service.impl;

import com.example.prac_ss12_phone_management.model.Smartphone;
import com.example.prac_ss12_phone_management.repository.ISmartphoneRepository;
import com.example.prac_ss12_phone_management.service.ISmartphoneService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartphoneServiceImpl implements ISmartphoneService {
    private final ISmartphoneRepository smartphoneRepository;

    public SmartphoneServiceImpl(ISmartphoneRepository smartphoneRepository) {
        this.smartphoneRepository = smartphoneRepository;
    }

    @Override
    public Iterable<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return smartphoneRepository.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartphone) {
        return smartphoneRepository.save(smartphone);
    }

    @Override
    public void remove(Long id) {
        smartphoneRepository.deleteById(id);
    }
}
