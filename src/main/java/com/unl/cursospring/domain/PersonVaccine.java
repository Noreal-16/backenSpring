package com.unl.cursospring.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity(name = "person_vaccine")
public class PersonVaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id", nullable = false)
    private Long id;

    private Long vaccined;
    private Long personId;
    private Date date;
    private Integer does;
}
