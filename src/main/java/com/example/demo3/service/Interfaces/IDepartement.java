package com.example.demo3.service.Interfaces;

import com.example.demo3.Model.Departement;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IDepartement {

    public List<Departement> getAllDepartement();

    public Departement save(Departement departement);
}
