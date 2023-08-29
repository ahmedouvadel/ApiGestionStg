package com.example.demo3.service.Interfaces;

import com.example.demo3.Model.Departement;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IDepartement {

    //GetMapping
    public List<Departement> getAllDepartement();
    // PostMapping
    public Departement save(Departement departement);
    //GetMapping ById
    public Departement getDepartementById(Long id);
    //PutMapping
    public Departement updateDepartement(Long id, Departement departement);
    //DeleteMapping
    public void deleteDepartement(Long id);
}
