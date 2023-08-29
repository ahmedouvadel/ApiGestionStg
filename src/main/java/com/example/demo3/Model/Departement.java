package com.example.demo3.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Departement")
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "nomDepartemnt")
    private  String nomdepartement;

   /** @ManyToOne()
    private Service service; */

   @OneToMany(mappedBy = "departement",fetch = FetchType.LAZY)
   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   private List<Service> service = new ArrayList<Service>();

   /** @OneToMany(mappedBy = "departement",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Direction> direction = new ArrayList<Direction>(); */

   @ManyToOne()
   private Direction direction;



}
