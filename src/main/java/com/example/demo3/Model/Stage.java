package com.example.demo3.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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
}
