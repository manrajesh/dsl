package com.example.dsl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "towns")
@Setter
@Getter
public class Town {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "town_id")
    private Long townId;

    @Column(name = "name")
    private String name;

    @Column(name = "people_count")
    private String peopleCount;

    @Column(name = "st_id")
    private Long stateId;
}
