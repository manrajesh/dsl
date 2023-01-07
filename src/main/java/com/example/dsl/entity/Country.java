package com.example.dsl.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "countries")
@Setter
@Getter
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long countryId;

    @Column(name = "name")
    private String name;

    @Column(name = "data")
    private String data;

    @OneToOne(mappedBy = "country")
    @JsonIgnore
    private State stateJoin;

}