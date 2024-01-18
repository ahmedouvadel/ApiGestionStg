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

    /**
     * endpoint: Methode pour Lister les Stagiaire
     * @return
     */
    @Override
    public List<Stagiaire> getAllStagiaire() {
        return stagiaireRepository.findAll();
    }

    /**
     * endpoint: Methode pour Create les Stagiaire
     * @return
     */
    @Override
    public Stagiaire save(Stagiaire stagiaire) {
        return stagiaireRepository.save(stagiaire);
    }

    /**
     * endpoint: Methode pour Lister les Stagiaire par Id
     * @return
     */
    @Override
    public Stagiaire getStagiaireById(UUID id) {
        return stagiaireRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));
    }

    /**
     * endpoint: Methode pour Modifier les Stagiaires
     * @return
     */
    @Override
    public Stagiaire updateStagiaire(UUID id, Stagiaire stagiaire) {
        Stagiaire existingStagiaire = stagiaireRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Fund"));

        existingStagiaire.setFirstname(stagiaire.getFirstname());
        existingStagiaire.setLastname(stagiaire.getLastname());
        existingStagiaire.setCin(stagiaire.getCin());
        existingStagiaire.setDatedeb(stagiaire.getDatedeb());
        existingStagiaire.setDatefin(stagiaire.getDatefin());
        existingStagiaire.setNbadge(stagiaire.getNbadge());
        existingStagiaire.setNumberphone(stagiaire.getNumberphone());

        return stagiaireRepository.save(existingStagiaire); // Save and return the updated entity
    }

    /**
     * endpoint: Methode pour Supprimer les Stagiaires
     * @return
     */
    @Override
    public void deleteStagiaire(UUID id) {
        stagiaireRepository.deleteById(id);
    }
}
