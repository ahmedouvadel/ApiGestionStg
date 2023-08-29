package com.example.demo3.service.Classes;

import com.example.demo3.Model.Departement;
import com.example.demo3.Repository.DepartementRepository;
import com.example.demo3.service.Interfaces.IDepartement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class DepartementImp implements IDepartement {

    @Autowired
    private DepartementRepository departementRepository;

    /**
     * endpoint: Methode pour Lister les Departement
     * @return
     */

    @Override
    public List<Departement> getAllDepartement() {
        return departementRepository.findAll();
    }

    /**
     * endpoint: Methode pour Create les Departement
     * @return
     */

    @Override
    public Departement save(Departement departement) {
        return departementRepository.save(departement);
    }

    /**
     * endpoint: Methode pour Lister  les Departement par Id
     * @return
     */
    @Override
    public Departement getDepartementById(Long id) {
        return departementRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not Fund"));
    }

    /**
     * endpoint: Methode pour Modifier les Departement
     * @return
     */
    @Override
    public Departement updateDepartement(Long id, Departement departement) {
        Departement existingDepartement = departementRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not Fund"));
        existingDepartement.setNomdepartement(departement.getNomdepartement());

        return departementRepository.save(existingDepartement);
    }

    /**
     * endpoint: Methode pour Supprimer les Departement
     * @return
     */
    @Override
    public void deleteDepartement(Long id) {
        departementRepository.deleteById(id);
    }
}
