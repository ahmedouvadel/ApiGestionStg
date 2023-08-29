package com.example.demo3.Controller;

import com.example.demo3.Model.Departement;
import com.example.demo3.service.Interfaces.IDepartement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Departement")
public class DepartementController {
    @Autowired
    private IDepartement iDepartement;
    /**
     * endpoint: pour lister les Departement
     * @return
     */
    @GetMapping
    public List<Departement> getAllDepartement() {
        return  iDepartement.getAllDepartement();
    }

    /**
     * endpoint: pour ajouter les Departement
     * @return
     */

    @PostMapping
    public  Departement createDepartement(@RequestBody Departement departement){
        Departement departement1 = iDepartement.save(departement);
        return departement1;
    }

    /**
     * endpoint: pour Lister les Departement par Id
     * @return
     */
    @GetMapping("{id}")
    public Departement getDepartementById(@PathVariable Long id){
        Departement departement = iDepartement.getDepartementById(id);
        return departement;
    }

    /**
     * endpoint: pour Modifiier les Departement
     * @return
     */
    @PutMapping("{id}")
    public ResponseEntity<Departement> updateDepartement(@PathVariable Long id,@RequestBody Departement departement){
        Departement updateDepartement = iDepartement.updateDepartement(id, departement);

        return  new ResponseEntity<>(updateDepartement,HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public void deleteDepartement(@PathVariable Long id) {
        iDepartement.deleteDepartement(id);
    }




}


