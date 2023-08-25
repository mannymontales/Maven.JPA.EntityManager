package com.example.project.repositories;

import com.example.project.models.Fragrance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FragranceRepository extends JpaRepository<Fragrance, Integer> {
}
