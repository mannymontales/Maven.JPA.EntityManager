package com.example.project.services;

import com.example.project.models.Fragrance;

import java.util.List;

public interface FragranceService {

    Fragrance createFragrance(Fragrance fragrance);
    Fragrance findFragranceById(int id);
    List<Fragrance> findAllFragrances();
    Fragrance updateFragrance(Fragrance fragrance);
    void deleteFragrance(int id);
}
