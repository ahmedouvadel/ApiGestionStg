package com.example.demo3.service.Classes;

import com.example.demo3.Model.Stagiaire;
import com.example.demo3.Repository.StagiaireRepository;
import com.example.demo3.service.Interfaces.IStagiaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
public class StagiaireImp implements IStagiaire {
    @Autowired
    private StagiaireRepository stagiaireRepository;
    @Override
    public List<Stagiaire> getAllStagiaire() {
        return stagiaireRepository.findAll();
    }
    @Override
    public Stagiaire save(Stagiaire stagiaire) {
        return stagiaireRepository.save(stagiaire);
    }
    @Override
    public Stagiaire getStagiaireById(UUID id) {
        return stagiaireRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));
    }
}
