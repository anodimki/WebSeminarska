package mk.ukim.finki.webseminarska_186034.service;

import mk.ukim.finki.webseminarska_186034.model.Category;
import mk.ukim.finki.webseminarska_186034.model.Manufacturer;

import java.util.List;
import java.util.Optional;

public interface ManufacturerService {

    Optional<Manufacturer> findById(Long id);
    List<Manufacturer> findAll();
    Optional<Manufacturer> save(String name, String address);
    Manufacturer create(String name, String address);
    void deleteById(Long id);
}

