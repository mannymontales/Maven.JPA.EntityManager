package com.example.project.services;

import com.example.project.models.Fragrance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.project.repositories.FragranceRepository;

import java.util.List;

@Service
public class FragranceServiceImplementation implements FragranceService{

    private final FragranceRepository fragranceRepository;

    @Autowired
    public FragranceServiceImplementation(FragranceRepository fragranceRepository) {
        this.fragranceRepository = fragranceRepository;
    }


    public Fragrance createFragrance(Fragrance fragrance) {
        return fragranceRepository.save(fragrance);
    }

    public Fragrance findFragranceById(int id) {
        if (fragranceRepository.findById(id).isPresent()){
            return fragranceRepository.findById(id).get();
        }
        return null;
    }

    public List<Fragrance> findAllFragrances() {
        return fragranceRepository.findAll();
    }

    public Fragrance updateFragrance(Fragrance fragrance) {
        return null;
    }

    public void deleteFragrance(int id) {
        fragranceRepository.deleteById(id);
    }
}
