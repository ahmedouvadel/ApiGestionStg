package com.example.demo3.Controller;
import com.example.demo3.Model.Stagiaire;
import com.example.demo3.service.Interfaces.IStagiaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/Stagiaire")
public class StagiaireController {

    @Autowired
    private IStagiaire iStagiaire;

    /**
     * endpoint: pour lister les stagiaires
     * @return
     */
    @GetMapping
    public List<Stagiaire> getAllStagiaire() {
        return iStagiaire.getAllStagiaire();
        }

    /**
     * endpoint: pour create les stagiaires
     * @return
     */
        @PostMapping
     public Stagiaire createStagiare(@RequestBody Stagiaire stagiaire){
            Stagiaire stagiaire1 = iStagiaire.save(stagiaire);
            return stagiaire1;
        }

    /**
     * endpoint: pour Listes les stagiaires ById
     * @return
     */


    @GetMapping("{id}")
    public Stagiaire getStagiaireById(@PathVariable UUID id){
        Stagiaire stagiaire = iStagiaire.getStagiaireById(id);
        return stagiaire;
    }

    /**
     * endpoint: pour Modifier les stagiaires par Id
     * @return
     */

    @PutMapping("/{id}") // Use a proper URI pattern with curly braces
    public ResponseEntity<Stagiaire> updateStagiaire(@PathVariable UUID id,@RequestBody Stagiaire stagiaire){
        Stagiaire updateStagiaire = iStagiaire.updateStagiaire(id, stagiaire);

        return  new ResponseEntity<>(updateStagiaire,HttpStatus.OK);
    }
   /** @PutMapping("{id}")
    public ResponseEntity<Stagiaire> updateStagiaire(@PathVariable UUID id ,@RequestBody Stagiaire stagiaireDetails){
        Stagiaire updateStagiaire = stagiaireRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));

        stagiaireDetails.setFirstname(stagiaireDetails.getFirstname());
        stagiaireDetails.setLastname(stagiaireDetails.getLastname());
        stagiaireDetails.setCin(stagiaireDetails.getCin());
        stagiaireDetails.setNumberphone(stagiaireDetails.getNumberphone());

        stagiaireRepository.save(updateStagiaire);

        return  ResponseEntity.ok(updateStagiaire);

    } */

    /**
     * endpoint: pour Supprime les stagiaires
     * @return
     */
    @DeleteMapping("{id}")
    public void deleteStagiaire(@PathVariable UUID id){
        iStagiaire.deleteStagiaire(id);
    }

   /** @DeleteMapping("{id}")
    public  ResponseEntity<HttpStatus> deleteStagiaire(@PathVariable UUID id) {

        Stagiaire stagiaire = stagiaireRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));

        stagiaireRepository.delete(stagiaire);

        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } */

}
