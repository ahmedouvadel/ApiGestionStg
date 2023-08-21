package com.example.demo3.service.Classes;

import com.example.demo3.Model.Departement;
import com.example.demo3.Repository.DepartementRepository;
import com.example.demo3.service.Interfaces.IDepartement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartementImp implements IDepartement {

    @Autowired
    private DepartementRepository departementRepository;
    @Override
    public List<Departement> getAllDepartement() {
        return  departementRepository.findAll();    }
    @Override
    public Departement save(Departement departement) {
        return departementRepository.save(departement);
    }
}
