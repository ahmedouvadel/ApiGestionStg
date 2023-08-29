package com.example.demo3.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.grammars.hql.HqlParser;

import java.time.LocalDate;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Stagiairee")
public class Stagiaire {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "nom")
    private String firstname;
    @Column(name = "preNom")
    private String lastname;
    @Column(name = "CIN")
    private Long cin;
    @Column(name = "nTelephone")
    private Long numberphone;


    @ManyToOne()
    private Stage stage;



}
