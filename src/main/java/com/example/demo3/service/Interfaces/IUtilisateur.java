package com.example.demo3.service.Interfaces;

import com.example.demo3.Model.Utlisateur;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface IUtilisateur {
    //GetMapping
     public List<Utlisateur> getAllUtilisateur();
     //PostMapping
     public Utlisateur save(Utlisateur utlisateur);
     //GetMapping By Id
    public Utlisateur getUtilisateurById(UUID id);
    //PutMapping
    public Utlisateur updateUtilisateur(UUID id, Utlisateur utlisateur);
    //DeleteMapping
    public void deleteUtilisateur(UUID id);
}
