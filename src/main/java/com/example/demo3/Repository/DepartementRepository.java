package com.example.demo3.Repository;

import com.example.demo3.Model.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement, Long> {
    //all Command on Crud
}
