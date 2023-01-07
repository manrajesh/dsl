package com.example.dsl.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "states")
@Setter
@Getter
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long stateId;

    @Column(name = "name")
    private String name;

    @Column(name = "count")
    private String count;

    @Column(name = "co_id")
    private Long countryId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "co_id", referencedColumnName = "id", updatable = false, insertable = false)
    private Country country;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "state_id", referencedColumnName = "id")
    private Set<Town> towns;

    
}
