package com.example.demo3.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Stage")
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dateDebut")
    private LocalDate datedeb;
    @Column(name = "dateFin")
    private LocalDate datefin;
    @Column(name = "nBadge")
    private  Integer nbadge;

    @OneToMany(mappedBy = "stage",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Stagiaire> stagiaire = new ArrayList<Stagiaire>();

    @ManyToOne()
    private Service service;

   /**  @OneToMany(mappedBy = "stage",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Service> service = new ArrayList<Service>(); */



}
