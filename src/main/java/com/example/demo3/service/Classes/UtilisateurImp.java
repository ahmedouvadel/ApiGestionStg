package com.example.demo3.service.Classes;

import com.example.demo3.Model.Utlisateur;
import com.example.demo3.Repository.UtilisateurRepository;
import com.example.demo3.service.Interfaces.IUtilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
public class UtilisateurImp implements IUtilisateur {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    /**
     * endpoint: Methode pour Lister les Utilisateurs
     * @return
     */
    @Override
    public List<Utlisateur> getAllUtilisateur() {
      return   utilisateurRepository.findAll();
    }

    /**
     * endpoint: Methode pour Create les Utilisateurs
     * @return
     */
    @Override
    public Utlisateur save(Utlisateur utlisateur) {
        return utilisateurRepository.save(utlisateur);
    }

    /**
     * endpoint: Methode pour Lister les Utilisateurs par Id
     * @return
     */
    @Override
    public Utlisateur getUtilisateurById(UUID id) {
        return utilisateurRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not Fund"));
    }

    /**
     * endpoint: Methode pour Modifier les Utilisateurs
     * @return
     */
    @Override
    public Utlisateur updateUtilisateur(UUID id, Utlisateur utlisateur) {
        Utlisateur existingUtilisateur = utilisateurRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not Found"));

        existingUtilisateur.setNomutilisateur(utlisateur.getNomutilisateur());
        existingUtilisateur.setMotdepasse(utlisateur.getMotdepasse());
        existingUtilisateur.setRole(utlisateur.getRole());

        return utilisateurRepository.save(existingUtilisateur);
    }

    /**
     * endpoint: Methode pour Supprimer les Utilisateurs
     * @return
     */
    public void deleteUtilisateur(UUID id) {
        utilisateurRepository.deleteById(id);
    }
}
