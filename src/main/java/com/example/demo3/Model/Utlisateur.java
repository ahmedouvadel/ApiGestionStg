package com.example.demo3.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Utilisateur")
public class Utlisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "nomUtilisatuer")
    private String nomutilisateur;
    @Column(name = "motDePasse")
    private String motdepasse;
    @Column(name = "Role")
    private String role;
}
