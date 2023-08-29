package com.example.demo3.Controller;

import com.example.demo3.Model.Utlisateur;
import com.example.demo3.service.Classes.UtilisateurImp;
import com.example.demo3.service.Interfaces.IUtilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/Utilisateur")
public class UtilisatuerController {
    @Autowired
    private IUtilisateur iUtilisateur;

    /**
     * endpoint: pour Lister les Utilisateur
     * @return
     */
    @GetMapping
    public List<Utlisateur> getAllUtilisateur(){ return iUtilisateur.getAllUtilisateur();
    }

    /**
     * endpoint: pour Create les Utilisateur
     * @return
     */
    @PostMapping
    public Utlisateur CeateUtilisateur(@RequestBody Utlisateur utlisateur){
        Utlisateur utlisateur1 = iUtilisateur.save(utlisateur);
        return utlisateur1;
    }

    /**
     * endpoint: pour Lister les Utilisateur par Id
     * @return
     */
    @GetMapping("{id}")
    public Utlisateur getUtilisateurById(@PathVariable UUID id){
        Utlisateur utlisateur = iUtilisateur.getUtilisateurById(id);
        return utlisateur;
    }

    /**
     * endpoint: pour Modifier les Utilisateur
     * @return
     */
    @PutMapping("{id}")
    public ResponseEntity<Utlisateur> updateUtilisateur(@PathVariable UUID id,@RequestBody Utlisateur utlisateur){
        Utlisateur updateUtilisateur = iUtilisateur.updateUtilisateur(id, utlisateur);

        return new ResponseEntity<>(updateUtilisateur, HttpStatus.OK);
    }

    /**
     * endpoint: pour Supprimer les Utilisateur
     * @return
     */
    @DeleteMapping("{id}")
    public  void deleteUtilisateur(@PathVariable UUID id) {
        iUtilisateur.deleteUtilisateur(id);
    }
}
