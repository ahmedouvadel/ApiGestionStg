package com.example.demo3.Controller;

import com.example.demo3.Model.Departement;
import com.example.demo3.Model.Direction;
import com.example.demo3.Model.Stage;
import com.example.demo3.Repository.DepartementRepository;
import com.example.demo3.service.Classes.DepartementImp;
import com.example.demo3.service.Interfaces.IDepartement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Departement")
public class DepartementController {
    @Autowired
    private DepartementRepository departementRepository;
    @Autowired
    DepartementImp departementImp;

    /**
     * endpoint: pour lister les Departement
     * @return
     */
    @GetMapping
    public List<Departement> getAllDepartement() {
        return  departementImp.getAllDepartement();
    }

    /**
     * endpoint: pour ajouter les Departement
     * @return
     */

    @PostMapping
    public  Departement createDepartement(@RequestBody Departement departement){
        Departement departement1 = departementImp.save(departement);
        return departement1;
    }

    /**
     * endpoint: pour Lister les Departement par Id
     * @return
     */

    @GetMapping("{id}")
    public ResponseEntity<Departement> getDepartementById(@PathVariable Long id) {
        Departement departement = departementRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));
        return  ResponseEntity.ok(departement);
    }

    /**
     * endpoint: pour Modifiier les Departement par Id
     * @return
     */
    @PutMapping
    public ResponseEntity<Departement> updateDepartement(@PathVariable Long id,@RequestBody Departement departementDetail) {
        Departement updateDepartement = departementRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));

        departementDetail.setNomdepartement(departementDetail.getNomdepartement());
        departementDetail.setNomdirection(departementDetail.getNomdirection());

        departementRepository.save(updateDepartement);
        return ResponseEntity.ok(updateDepartement);

    }
}


