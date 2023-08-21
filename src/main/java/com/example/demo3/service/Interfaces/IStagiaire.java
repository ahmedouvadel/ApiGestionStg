package com.example.demo3.service.Interfaces;

import com.example.demo3.Model.Direction;
import com.example.demo3.Model.Stagiaire;

import java.util.List;
import java.util.UUID;

public interface IStagiaire {
    List<Stagiaire> getAllStagiaire();

    public Stagiaire save(Stagiaire stagiaire);

     public Stagiaire getStagiaireById(UUID id);
}
