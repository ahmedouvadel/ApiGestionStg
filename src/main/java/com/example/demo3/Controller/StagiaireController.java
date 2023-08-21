package com.example.demo3.Controller;

import com.example.demo3.Model.Stagiaire;
import com.example.demo3.Repository.StagiaireRepository;
import com.example.demo3.service.Classes.StagiaireImp;
import com.example.demo3.service.Interfaces.IStagiaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/Stagiaire")
public class StagiaireController {
    @Autowired
     private StagiaireRepository stagiaireRepository;

    @Autowired
    StagiaireImp stagiaireImp;

    /**
     * endpoint: pour lister les stagiaires
     * @return
     */
    @GetMapping
    public List<Stagiaire> gettAllStagiaire() {
        return stagiaireImp.getAllStagiaire();
        }

    /**
     * endpoint: pour create les stagiaires
     * @return
     */
        @PostMapping
     public Stagiaire createStagiare(@RequestBody Stagiaire stagiaire){
            Stagiaire stagiaire1 = stagiaireImp.save(stagiaire);
            return stagiaire1;
        }

    /**
     * endpoint: pour Listes les stagiaires ById
     * @return
     */


    @GetMapping("{id}")
    public Stagiaire getStagiaireById(@PathVariable UUID id){
        Stagiaire stagiaire = stagiaireImp.getStagiaireById(id);
        return stagiaire;
    }

    /**
     * endpoint: pour Modifier les stagiaires par Id
     * @return
     */
    @PutMapping("{id}")
    public ResponseEntity<Stagiaire> updateStagiaire(@PathVariable UUID id ,@RequestBody Stagiaire stagiaireDetails){
        Stagiaire updateStagiaire = stagiaireRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));

        stagiaireDetails.setFirstname(stagiaireDetails.getFirstname());
        stagiaireDetails.setLastname(stagiaireDetails.getLastname());
        stagiaireDetails.setCin(stagiaireDetails.getCin());
        stagiaireDetails.setNumberphone(stagiaireDetails.getNumberphone());

        stagiaireRepository.save(updateStagiaire);

        return  ResponseEntity.ok(updateStagiaire);

    }

    /**
     * endpoint: pour Supprime les stagiaires
     * @return
     */

    @DeleteMapping("{id}")
    public  ResponseEntity<HttpStatus> deleteStagiaire(@PathVariable UUID id) {

        Stagiaire stagiaire = stagiaireRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));

        stagiaireRepository.delete(stagiaire);

        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
