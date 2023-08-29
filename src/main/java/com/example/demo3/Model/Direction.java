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
@Table(name = "Direction")
public class Direction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "nomDirection")
    private String nomdirection;

    /** @ManyToOne()
    private Departement departement; */

    @OneToMany(mappedBy = "direction",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Departement> departement = new ArrayList<Departement>();


}
