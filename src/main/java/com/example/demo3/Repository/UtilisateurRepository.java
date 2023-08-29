package com.example.demo3.Repository;

import com.example.demo3.Model.Utlisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UtilisateurRepository extends JpaRepository<Utlisateur, UUID> {
   //All Crud
}

