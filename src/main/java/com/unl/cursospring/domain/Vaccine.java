package com.unl.cursospring.domain;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "vaccine")
public class Vaccine {
    /**
     * Se tiene las entidades para la BD
     * Las anotaciones en sprint ayudan a reducir codigo "Las anotaciones tienen el @ antes"
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id", nullable = false, unique = true)
    private Long id;

    @Column(name = "vaccine_name")
    private String name;
    private String lot;
}
