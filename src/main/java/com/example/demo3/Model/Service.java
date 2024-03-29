package com.example.demo3.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomService")
    private String nomservice;


   /** @ManyToOne()
    private Stage stage; */

    @OneToMany(mappedBy = "service",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Stagiaire> stage = new ArrayList<Stagiaire>();


   /** @OneToMany(mappedBy = "service",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Departement> departement = new ArrayList<Departement>(); */

   @ManyToOne()
   private Departement departement;

}
