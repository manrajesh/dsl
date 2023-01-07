package com.example.dsl;

import com.example.dsl.entity.Country;
import com.example.dsl.entity.QCountry;
import com.example.dsl.entity.QState;
import com.example.dsl.entity.QTown;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private EntityManager entityManager;

    @Override
    public void run(String... args) throws Exception {
        QCountry country = QCountry.country;
        QState state = QState.state;
        JPAQuery query = new JPAQuery(entityManager);

        List<SecondDto> result1 = query
                .select(Projections.constructor(SecondDto.class, country.name, country.stateJoin))
                .from(country)
                .join(country.stateJoin, QState.state)
                .join(state.towns, QTown.town)
                .fetch();

        /*List<Dto> result = query
                .select(Projections.constructor(Dto.class, state.name, state.towns))
                .from(state)
                .join(state.towns, QTown.town)
                .fetch();*/

        System.out.println("*** "+ result1);
//        System.out.println("*** "+ result);
    }
}
