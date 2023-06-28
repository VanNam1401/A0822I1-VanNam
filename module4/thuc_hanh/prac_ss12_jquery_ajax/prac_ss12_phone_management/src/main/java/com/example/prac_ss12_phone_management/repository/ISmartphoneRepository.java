package com.example.prac_ss12_phone_management.repository;

import com.example.prac_ss12_phone_management.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository extends CrudRepository<Smartphone, Long> {
}
