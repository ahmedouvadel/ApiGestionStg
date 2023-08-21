package com.example.demo3.Repository;

import com.example.demo3.Model.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StagiaireRepository extends JpaRepository<Stagiaire, UUID> {
    // All commend on Crud
}
